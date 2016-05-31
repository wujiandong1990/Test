package com.gtjt.xxjss.test.regularexpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {

	public static void main(String[] args) {
//		Pattern pattern = Pattern.compile("[a-zA-Z]");
//		Matcher matcher = pattern.matcher("aAb");
//		p(matcher.matches());
		
//		p(matcher.lookingAt());
//		
//		p("A".matches("[a-zA-Z]"));
		
		//wujiandong098@163.com
		//^[a-zA-Z0-9_]+@[a-z0-9].com$
//		p("wujiandong098@163.com".matches("^\\w+@163.com$"));
		
//		p("2016-05-06".matches("([0-9]*)(-)"));
		
		Pattern pattern = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
		Matcher matcher = pattern.matcher("2016-05-01");
		while (matcher.find()) {
			p(matcher.group());
		}
	}
	
	public static void p(Object o) {
		System.out.println(o);
	}
	
}
