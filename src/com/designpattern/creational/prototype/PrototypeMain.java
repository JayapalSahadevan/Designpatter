package com.designpattern.creational.prototype;

public class PrototypeMain {
	public static void main(String[] args) {
		BankPrototype bank = new BankPrototype();
		bank.setBankId("1");
		bank.setBankName("BOA");
		bank.loadServices();
		
		BankPrototype bank1 = bank.clone();
		bank1.setBankName("citi");
		bank1.setBankId("2");
		bank.getServices().remove(0);
		
		System.out.println(bank + " " + bank.getBankName() + " " + bank.getServices());
		
		System.out.println(bank1 + " " + bank1.getBankName() + " " + bank1.getServices());
	}

}
