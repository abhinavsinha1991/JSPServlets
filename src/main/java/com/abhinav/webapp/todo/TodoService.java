package com.abhinav.webapp.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
    
    private static List<Todo> todoList = new ArrayList<>();
    
    static {
        todoList.add(new Todo("Finish servlets"));
        todoList.add(new Todo("Finish JPA/Spring/Hibernate/MVC/DI"));
        todoList.add(new Todo("Master Springboot"));
    }
    
    public List<Todo> retrieveTodos(){
        return todoList;
    }
    
    public void addTodo(String name){
        todoList.add(new Todo(name));
    }
    
    public void deleteTodo(){
    
    }
    
}
