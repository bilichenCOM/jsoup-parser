package com.bilichenko.jsoup;

import java.util.List;

import com.bilichenko.jsoup.dao.MotorbikeDao;
import com.bilichenko.jsoup.dao.impl.MotorbikeDaoImpl;
import com.bilichenko.jsoup.dao.mapper.impl.MotorbikeElementMapper;
import com.bilichenko.jsoup.model.AbstractMotorbike;
import com.bilichenko.jsoup.parser.MotorbikeJsoupParser;
import com.bilichenko.jsoup.parser.impl.MotorbikeJsoupParserImpl;

public class Main {
	private static final String KAWASAKI_URL = "https://www.kawasaki.com/category/motorcycle";
	private static final String KAWASAKI_REGEX = "product-item column small-3 left";

	public static void main(String[] args) {
		MotorbikeJsoupParser motorbikeJsoupParser = new MotorbikeJsoupParserImpl();
		List<AbstractMotorbike> motorbikes = motorbikeJsoupParser.parseEntites(KAWASAKI_URL, KAWASAKI_REGEX,
				new MotorbikeElementMapper());
		MotorbikeDao motorbikeDao = new MotorbikeDaoImpl();
		motorbikeDao.saveAll(motorbikes);
	}
}
