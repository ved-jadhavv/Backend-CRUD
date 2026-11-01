package com.example.crud_fullstack.Controller;

import com.example.crud_fullstack.Model.User2;
import com.example.crud_fullstack.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("http://localhost:5175")
@RestController
public class UserController {

    @Autowired
    public UserService service;

    @GetMapping("/")
    public List<User2> getUsers(){
        return service.getUser();
    };

    @PostMapping("/addUser")
    public User2 addUser(@RequestBody User2 user){
        return  service.addUser(user);
    };

    @PutMapping("/user/{id}")
    public User2 updateUser(@PathVariable long id, @RequestBody User2 user){
        user.setId(id);
        return service.updUser(user);
    };


    @DeleteMapping("/user/{id}")
    public void deleteUser(@PathVariable long id){
         service.deleteUser(id);
    }
}
