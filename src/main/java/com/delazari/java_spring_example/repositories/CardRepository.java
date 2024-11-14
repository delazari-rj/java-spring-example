package com.delazari.java_spring_example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.delazari.java_spring_example.entities.Card;

public interface CardRepository extends JpaRepository<Card, Long>{

}