package com.lrm.blog.dao;

import com.lrm.blog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


    //Define the method to find username&password
    User findByUsernameAndPassword(String username, String password);


}
