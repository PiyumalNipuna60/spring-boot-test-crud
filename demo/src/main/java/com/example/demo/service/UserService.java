package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public List<UserDTO> getAllUser() {
        List<User> all = userRepo.findAll();
        return modelMapper.map(all, new TypeToken<List<UserDTO>>() {
        }.getType());
    }


    public UserDTO updateUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public boolean deleteUser(int id) {
        if(userRepo.existsById(id)){
            userRepo.deleteById(id);
            return true;
        }else {
            return false;
        }

    }

    public Object searchUser(int id) {
        if(userRepo.existsById(id)){
            return userRepo.findById(id);
        }else {
            return null;
        }
    }



}
