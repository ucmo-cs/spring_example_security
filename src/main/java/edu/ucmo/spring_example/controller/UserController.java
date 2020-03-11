package edu.ucmo.spring_example.controller;

import edu.ucmo.spring_example.model.User;
import edu.ucmo.spring_example.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserDao userDao;

    @GetMapping
    public List<User> listUsers(){
        List<User> list = new ArrayList<>();
        userDao.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
