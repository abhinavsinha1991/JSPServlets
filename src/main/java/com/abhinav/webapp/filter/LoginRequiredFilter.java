package com.abhinav.webapp.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter(urlPatterns = "*.do")
public class LoginRequiredFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpServletRequest=(HttpServletRequest)servletRequest;

        if((httpServletRequest.getSession().getAttribute("name")) != null)
            filterChain.doFilter(servletRequest,servletResponse);
        else
            httpServletRequest.getRequestDispatcher("/login.do").forward(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
