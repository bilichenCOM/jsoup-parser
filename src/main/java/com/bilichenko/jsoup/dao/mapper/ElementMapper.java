package com.bilichenko.jsoup.dao.mapper;

import org.jsoup.nodes.Element;

public interface ElementMapper<T> {

	T resolveHtmlElement(Element element);
}
