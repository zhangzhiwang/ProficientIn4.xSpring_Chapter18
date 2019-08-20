package com.asiainfo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

import com.asiainfo.entity.User;

/**
 * 登陆过滤器
 *
 * @author zhangzhiwang
 * @date Aug 20, 2019 7:35:38 PM
 */
public class LoginFilter implements Filter {
	/** 过滤标识 */
	private static final String IS_FILTERED = "isFiltered";
	/** 不需登录即可访问的URL */
	private static final String[] ESCAPE_URLS = { "/userController/met1", "/userController/doLogin" };

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 保证该过滤器在一次请求中只被调用一次
		if (request != null && request.getAttribute(IS_FILTERED) != null) {// 如果被调用过一次则无需再次被调用，直接往下走
			chain.doFilter(request, response);
		} else {// 该过滤器第一次被调用
			request.setAttribute(IS_FILTERED, true);
			HttpServletRequest httpServletRequest = (HttpServletRequest) request;
			User user = (User) httpServletRequest.getSession().getAttribute("user");
			if (user != null || !needLogin(httpServletRequest.getRequestURI(), httpServletRequest)) {
				chain.doFilter(request, response);
			} else {
				String wholeUrl = httpServletRequest.getRequestURL().toString();
				String queryString = httpServletRequest.getQueryString();
				if (StringUtils.isNotBlank(queryString)) {
					wholeUrl += "?" + queryString;
				}

				// 将请求的URL放到session中，用于登陆后直接跳转到该URL
				httpServletRequest.getSession().setAttribute("loginToUrl", wholeUrl);
				// 转发到登陆页面
				request.getRequestDispatcher("login").forward(request, response);
			}
		}
	}

	/**
	 * uri是否需要登录
	 * 
	 * @param uri
	 * @param httpServletRequest
	 * @return
	 * @author zhangzhiwang
	 * @date Aug 20, 2019 8:23:52 PM
	 */
	private boolean needLogin(String uri, HttpServletRequest httpServletRequest) {
		if (httpServletRequest.getContextPath().equalsIgnoreCase(uri) || (httpServletRequest.getContextPath() + "/").equalsIgnoreCase(uri)) {
			return false;
		}

		for (String escapeUrl : ESCAPE_URLS) {
			if (StringUtils.isNotBlank(uri) && uri.contains(escapeUrl)) {
				return false;
			}
		}

		return true;
	}
}
