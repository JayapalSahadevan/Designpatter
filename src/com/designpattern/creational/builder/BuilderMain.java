package com.designpattern.creational.builder;

public class BuilderMain {
	public static void main(String[] args) {
		Bank bank = new BankBuilder().setBankName("BOA").setHlIntrest(7.01f).setOnlineBanking(false).build();
		System.out.println(bank.toString());
	}

}
