package com.abhinav.webapp.todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/deletetodo.do")
public class DeleteTodoServlet extends HttpServlet {

    TodoService todoService = new TodoService();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        String name=request.getParameter("todo");
        todoService.deleteTodo(new Todo(name));
        response.sendRedirect("/todo.do");


    }

}
