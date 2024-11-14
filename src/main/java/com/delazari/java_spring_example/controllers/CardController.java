package com.delazari.java_spring_example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delazari.java_spring_example.entities.Card;
import com.delazari.java_spring_example.services.CardService;

@RestController
@RequestMapping(value = "/cards")
public class CardController {
	
	@Autowired
	private CardService service;
	
	@GetMapping
	public List<Card> findAll() {
		return service.findAll();
	}
}
