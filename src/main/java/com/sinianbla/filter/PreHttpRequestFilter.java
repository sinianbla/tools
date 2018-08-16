package com.sinianbla.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.sinianbla.entity.UserEntity;

public class PreHttpRequestFilter implements Filter {
	private final static Logger logger = LoggerFactory.getLogger(PreHttpRequestFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		logger.info("---------------------------- I'm in ------------------------");
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		logger.info("session ->" + req.getSession());
		UserEntity user = (UserEntity)req.getSession().getAttribute("userInfo");
		if (user == null || user.getLoginName()== null){
			String requestPath = req.getServletPath();
			if(requestPath.equals("/user/loginPage") || requestPath.equals("/user/login")){
				chain.doFilter(request, response);
			} else{
				res.sendRedirect("/tools/user/loginPage");
			}
			logger.info("¶Ë¿Ú:" + request.getServerPort());
		} else {
			chain.doFilter(request, response);
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
