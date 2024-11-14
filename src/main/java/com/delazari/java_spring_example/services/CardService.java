package com.delazari.java_spring_example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.delazari.java_spring_example.entities.Card;
import com.delazari.java_spring_example.repositories.CardRepository;

@Service
public class CardService {
	
	@Autowired
	private CardRepository repository;
	
	@Transactional(readOnly = true)
	public List<Card> findAll() {
		return repository.findAll();
	}
}
