package com.delazari.java_spring_example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delazari.java_spring_example.dto.CardMinDTO;
import com.delazari.java_spring_example.services.CardService;

@RestController
@RequestMapping(value = "/cards")
public class CardController {
	
	@Autowired
	private CardService service;
	
	@GetMapping
	public ResponseEntity<List<CardMinDTO>> findAll() {
		List<CardMinDTO> result = service.findAll(); 
		return ResponseEntity.ok().body(result);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CardMinDTO> findById(@PathVariable Long id){
		CardMinDTO result = service.findById(id);
		return ResponseEntity.ok().body(result);
	}
}