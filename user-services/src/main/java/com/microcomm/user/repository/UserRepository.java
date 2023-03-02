package com.microcomm.user.repository;

import com.microcomm.user.domaine.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAll();
}
