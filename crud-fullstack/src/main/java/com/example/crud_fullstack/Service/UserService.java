package com.example.crud_fullstack.Service;

import com.example.crud_fullstack.Model.User2;
import com.example.crud_fullstack.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    public List<User2> getUser(){
        return repo.findAll();
    };

    public User2 addUser(User2 user){
        return repo.save(user);
    };

    public User2 updUser(User2 user){
        return repo.save(user);
    }

    public void deleteUser(long id){
        repo.deleteById(id);
    };
};
