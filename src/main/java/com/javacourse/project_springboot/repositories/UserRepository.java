package com.javacourse.project_springboot.repositories;

import com.javacourse.project_springboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
