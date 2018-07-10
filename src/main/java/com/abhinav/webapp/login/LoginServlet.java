package com.abhinav.webapp.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
    
    LoginService loginService=new LoginService();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
        String name=request.getParameter("name");
        
        request.getSession().setAttribute("name",name);
	}
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        String name=request.getParameter("name");
        String password=request.getParameter("password");
        
        if(loginService.validateUser(name,password)) {
    
            request.getSession().setAttribute("name", name);
            response.sendRedirect("/todo.do");
            
        }else{
            
            request.setAttribute("errorMessage", "Invalid Credentials!!");
            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
            
        }
    }

}