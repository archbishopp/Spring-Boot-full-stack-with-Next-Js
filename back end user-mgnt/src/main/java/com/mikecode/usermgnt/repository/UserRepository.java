package com.mikecode.usermgnt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mikecode.usermgnt.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository <UserEntity, Long> {
    
}
