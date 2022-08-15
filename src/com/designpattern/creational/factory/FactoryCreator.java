package com.designpattern.creational.factory;

public class FactoryCreator {
	
	public static Bank getInstance(String bankName) {
		if("BOA".equalsIgnoreCase(bankName)) {
			return new BOA();
		}else if("Citi".equalsIgnoreCase(bankName)) {
			return new Citi();
		}else if ("JPMorgan".equalsIgnoreCase(bankName)) {
			return new JPMorgan();
		}
		
		return null;
	}

}
