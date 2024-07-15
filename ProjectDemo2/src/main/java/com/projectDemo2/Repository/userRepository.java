package com.projectDemo2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectDemo2.Entity.User;

public interface userRepository extends JpaRepository<User, Long> {

}
