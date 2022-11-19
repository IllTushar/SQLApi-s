package com.example.newDemo.newDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
public class Controler {
 @Autowired
 private Services services;

 @RequestMapping("/todo")
    public List<Response> getAllToDo(){return services.getAllToDo();}

//    @RequestMapping("/todo/{id}")
//    public Response getAllToDo1(@PathVariable Integer id){
//     return services.getAllToDo1(id);
//    }
    @RequestMapping(method = RequestMethod.POST,value = "/todo")
    public void postToDo(@RequestBody Response response){
      services.postToDo(response);
    }
    @RequestMapping(method = RequestMethod.PUT,value = "/todo/{name}")
    public void putTodo(@PathVariable String name,@RequestBody Response response){
     services.putTodo(name,response);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/todo/{name}")
    public void deleteTodo(@PathVariable String name,@RequestBody Response response){
     services.deleteToDo(name,response);
    }
}
