package com.bilichenko.jsoup.dao;

import java.util.List;

import com.bilichenko.jsoup.model.AbstractMotorbike;

public interface MotorbikeDao {

	AbstractMotorbike save(AbstractMotorbike motorbike);

	void saveAll(List<AbstractMotorbike> motorbikes);
}
