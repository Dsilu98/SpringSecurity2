package com.smart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smart.Entity.Contact;

import jakarta.persistence.criteria.CriteriaBuilder.In;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
