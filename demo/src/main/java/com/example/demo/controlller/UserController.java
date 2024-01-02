package com.example.demo.controlller;

import com.example.demo.dto.UserDTO;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/user")
@RestController
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public List<UserDTO> getUser(){
        return userService.getAllUser();
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
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
