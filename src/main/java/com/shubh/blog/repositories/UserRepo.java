package com.shubh.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shubh.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
