package com.example.demo.controlller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/user")
@RestController
@CrossOrigin
public class UserController {

    @GetMapping("/getUser")
    public String getUser(){
        return "get-all-user";
    }

    @PostMapping("/saveUser")
    public String saveUser(){
        return "save-user";
    }

    @PutMapping("/updateUser")
    public String updateUser(){
        return "update-user";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "delete-user";
    }

    @GetMapping("/searchUser")
    public String searchUser(){
        return "search-user";
    }



}
