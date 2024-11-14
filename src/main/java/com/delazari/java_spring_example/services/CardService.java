package com.delazari.java_spring_example.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.delazari.java_spring_example.dto.CardMinDTO;
import com.delazari.java_spring_example.entities.Card;
import com.delazari.java_spring_example.repositories.CardRepository;
import com.delazari.java_spring_example.services.exceptions.ObjectNotFoundException;

@Service
public class CardService {
	
	@Autowired
	private CardRepository repository;
	
	@Transactional(readOnly = true)
	public List<CardMinDTO> findAll() {
		List<Card> result = repository.findAll();
		return result.stream().map(CardMinDTO::new).toList();
	}
	
	@Transactional(readOnly = true)
	public CardMinDTO findById(@PathVariable Long id) {
		Card result;
		try {
			result = repository.findById(id).get();
		} catch (NoSuchElementException e) {
			throw new ObjectNotFoundException("Object not found: " + id);
		}
		return new CardMinDTO(result);
	}
}