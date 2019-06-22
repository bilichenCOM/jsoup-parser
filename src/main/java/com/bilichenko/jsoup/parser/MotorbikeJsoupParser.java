package com.bilichenko.jsoup.parser;

import com.bilichenko.jsoup.model.AbstractMotorbike;

public abstract class MotorbikeJsoupParser implements JsoupParser<AbstractMotorbike> {
	
	public abstract AbstractMotorbike getMotorbikeByManufacturerName(String name);

}