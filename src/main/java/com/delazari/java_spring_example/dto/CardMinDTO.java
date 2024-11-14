package com.delazari.java_spring_example.dto;

import com.delazari.java_spring_example.entities.Card;

public class CardMinDTO {
	
	private Long id;
	private String name;
	private String description;
	
	public CardMinDTO(Card card) {
		this.id = card.getId();
		this.name = card.getName();
		this.description = card.getDescription();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}