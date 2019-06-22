package com.bilichenko.jsoup.utils;

import org.jsoup.nodes.Element;

public class HtmlParseUtils {

	public static String getTextByClassName(Element element, String className) {
		return element
				.getElementsByClass(className)
				.get(0)
				.text();
	}

	public static String getImagerSrc(Element element) {
		return element
				.getElementsByTag("img")
				.get(0).attr("src");
	}

	public static Double getDoubleByClassName(Element element, String className) {
		String text = getTextByClassName(element, className)
				.replaceAll("[^\\d]+", "");

		if (text.isEmpty()) {
			return 0.0;
		}

		return Double.parseDouble(text);
	}
}
