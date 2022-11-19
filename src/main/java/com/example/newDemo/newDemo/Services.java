package com.example.newDemo.newDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Services {
    @Autowired
    private newRespo newRespo;
    public List<Response> getAllToDo() {
        ArrayList<Response> list = new ArrayList<>();
        newRespo.findAll().forEach(list::add);
        return list;
    }

    public void postToDo(Response response) {
        newRespo.save(response);
    }

    public void putTodo(String name, Response response) {
        newRespo.save(response);
    }

    public void deleteToDo(String name, Response response) {
        newRespo.delete(response);
    }
}
