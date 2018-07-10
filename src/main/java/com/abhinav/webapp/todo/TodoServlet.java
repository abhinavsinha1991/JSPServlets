package com.abhinav.webapp.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/todo.do")
public class TodoServlet extends HttpServlet {
    
   TodoService todoService=new TodoService();
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    
        
        request.setAttribute("todos",todoService.retrieveTodos());
        request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);

        
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        
        String name=request.getParameter("todo");
        if(!name.isEmpty()) {
            todoService.addTodo(name);
            response.sendRedirect("/todo.do");
        } else {
            request.setAttribute("errorMessage", new String("Enter a non-empty description for Todo"));
            request.setAttribute("todos",todoService.retrieveTodos());
            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
        }
    }
}
