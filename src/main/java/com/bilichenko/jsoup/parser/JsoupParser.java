package com.bilichenko.jsoup.parser;

import java.util.List;

import com.bilichenko.jsoup.dao.mapper.ElementMapper;

public interface JsoupParser<T> {
	List<T> parseEntites(String url, String className, ElementMapper<T> mapper);
}
