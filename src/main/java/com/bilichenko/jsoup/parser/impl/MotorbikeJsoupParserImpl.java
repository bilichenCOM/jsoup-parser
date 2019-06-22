package com.bilichenko.jsoup.parser.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.jsoup.Jsoup;

import com.bilichenko.jsoup.dao.mapper.ElementMapper;
import com.bilichenko.jsoup.model.AbstractMotorbike;
import com.bilichenko.jsoup.parser.MotorbikeJsoupParser;

public class MotorbikeJsoupParserImpl extends MotorbikeJsoupParser {
	private static final Logger logger = Logger.getLogger(MotorbikeJsoupParserImpl.class);

	@Override
	public List<AbstractMotorbike> parseEntites(String url, String className, ElementMapper<AbstractMotorbike> mapper) {
		List<AbstractMotorbike> motorbikes = new ArrayList<>();

		try {
			Jsoup.connect(url).get()
				.getElementsByClass(className)
					.forEach(e -> motorbikes.add(mapper.resolveHtmlElement(e)));
		} catch (IOException e) {
			logger.debug(String.format("cannot reach specified url: %s", url));
		}
		return motorbikes;
	}

	@Override
	public AbstractMotorbike getMotorbikeByManufacturerName(String name) {
		return null;
	}
}