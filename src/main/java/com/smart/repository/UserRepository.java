package com.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.Entity.User;

import jakarta.persistence.criteria.CriteriaBuilder.In;

public interface UserRepository extends JpaRepository<User, Integer>{

}
