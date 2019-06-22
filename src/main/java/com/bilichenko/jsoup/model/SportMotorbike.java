package com.bilichenko.jsoup.model;

import javax.persistence.Entity;

@Entity
public class SportMotorbike extends AbstractMotorbike {

	public SportMotorbike() {}
	public SportMotorbike(Long id, String manufacturerName, String modelName, String year, Double cc, Double price,
			String imageUrl) {
		super(id, manufacturerName, modelName, year, cc, price, imageUrl);
	}
}