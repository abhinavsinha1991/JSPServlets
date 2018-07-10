package com.abhinav.webapp.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
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

    @Override
    public void init() throws ServletException {
        System.out.println("\n\n init() method called \n\n");
        super.init();
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("\n\n service method called \n\n");
	    super.service(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("\n\n destroy method called \n\n");
        super.destroy();
    }
}