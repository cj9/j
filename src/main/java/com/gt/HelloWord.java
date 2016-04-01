package com.gt;

import org.apache.log4j.Logger;

public class HelloWord {
   static Logger logger = Logger.getLogger(HelloWord.class);
   public static void main(String[] args) {
	System.out.println("hello world");
	logger.info("study maven");//Ã»ÓÐ¼Ólog4j.properties
}
}
