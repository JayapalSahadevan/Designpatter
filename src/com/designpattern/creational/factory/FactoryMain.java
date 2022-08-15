package com.designpattern.creational.factory;

public class FactoryMain {

	public static void main(String[] args) {
		Bank bank = FactoryCreator.getInstance("BOA");
		bank.printBankName();
	}

}
