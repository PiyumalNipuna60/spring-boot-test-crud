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
    public UserDTO updateUser(@RequestBody UserDTO userDTO){
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable  int id){
        if (userService.deleteUser(id)){
            return "Resource with ID " + id + " deleted successfully";
        }else{
            return "Something Wrong..!";
        }
    }

    @GetMapping("/searchUser/{id}")
    public Object searchUser(@PathVariable int id){
        return userService.searchUser(id);
    }

    @GetMapping("/searchByUserName/{id}/{name}")
    public Object searchUser(@PathVariable String id, @PathVariable String name){
        return userService.searchByUserName(id,name);
    }
}
