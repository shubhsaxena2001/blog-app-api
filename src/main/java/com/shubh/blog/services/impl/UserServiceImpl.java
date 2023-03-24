package com.shubh.blog.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.shubh.blog.entities.User;
import com.shubh.blog.payloads.UserDto;
import com.shubh.blog.services.UserService;
import com.shubh.blog.repositories.*;

public class UserServiceImpl implements UserService {
    
    @Autowired
    private UserRepo UserRepo;
    
    @Override
    public UserDto createUser(UserDto userDto) {
        User user = this.dtoToUser(userDto);
        User savedUser = this.UserRepo.save(user);
        return this.userToDto(savedUser);
    }
    
    @Override
    public UserDto updateUser(UserDto user, Integer userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUser'");
    }
    
    @Override
    public void deleteUser(Integer userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUser'");
    }
    
    @Override
    public UserDto getUserById(Integer userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getUserById'");
    }
    
    @Override
    public List<UserDto> getAllUsers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllUsers'");
    }
    
    private User dtoToUser(UserDto userDto) {
        
        User user = new User();
        user.setId(userDto.getId());
        user.setAbout(userDto.getAbout());
        user.setEmail(userDto.getEmail());
        user.setName(userDto.getName());
        user.setPassword(userDto.getPassword());
        
        return user;
    }

    private UserDto userToDto(User user) {
        
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setAbout(user.getAbout());
        userDto.setEmail(user.getEmail());
        userDto.setName(user.getName());
        userDto.setPassword(user.getPassword());
        
        return userDto;
    }
    
}
