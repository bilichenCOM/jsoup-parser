package com.bilichenko.jsoup.dao.mapper.impl;

import org.jsoup.nodes.Element;

import com.bilichenko.jsoup.dao.mapper.ElementMapper;
import com.bilichenko.jsoup.model.AbstractMotorbike;
import com.bilichenko.jsoup.model.SportMotorbike;
import com.bilichenko.jsoup.utils.HtmlParseUtils;

public class MotorbikeElementMapper implements ElementMapper<AbstractMotorbike>{

	private static final String MODEL_HTML_CLASS_NAME = "prod-model-name";
	private static final String PRICE_HTML_CLASS_NAME = "model-msrp";
	private static final String YEAR_HTML_CLASS_NAME = "model-year";
	
	@Override
	public AbstractMotorbike resolveHtmlElement(Element element) {
		AbstractMotorbike motorbike = new SportMotorbike();
		motorbike.setManufacturerName("KAWASAKI");
		motorbike.setModelName(HtmlParseUtils.getTextByClassName(element, MODEL_HTML_CLASS_NAME));
		motorbike.setYear(HtmlParseUtils.getTextByClassName(element, YEAR_HTML_CLASS_NAME));
		motorbike.setCc(HtmlParseUtils.getDoubleByClassName(element, MODEL_HTML_CLASS_NAME));
		motorbike.setPrice(HtmlParseUtils.getDoubleByClassName(element, PRICE_HTML_CLASS_NAME));
		motorbike.setImageUrl(HtmlParseUtils.getImagerSrc(element));
		return motorbike;
	}
}