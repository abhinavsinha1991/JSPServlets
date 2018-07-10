package com.abhinav.webapp.todo;

public class Todo {
    
    @Override
    public String toString() {
        return "Todo{" +
                "name='" + name + '\'' +
                '}';
    }
    
    public String getName() {
        return name;
    }
    
    public Todo(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    private String name;
}
