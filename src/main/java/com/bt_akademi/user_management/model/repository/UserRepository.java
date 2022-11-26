package com.bt_akademi.user_management.model.repository;

import com.bt_akademi.user_management.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer>
{

    // SELECT * FROM USERS WHERE USERNAME = ?;
    User findByUsername(String username); // aranan username'e sahip user
}

