package com.designpattern.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BankPrototype implements Cloneable {
	
	private String bankId;
	private String bankName;
	private List<String> services;
	
		
	public void loadServices() {
		services = new ArrayList<>();
		services.add("Phone Banking");
		services.add("Online Banking");		
	}


	public String getBankId() {
		return bankId;
	}


	public void setBankId(String bankId) {
		this.bankId = bankId;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public List<String> getServices() {
		return services;
	}


	public void setServices(List<String> services) {
		this.services = services;
	}
	
	@Override
	public BankPrototype clone() {		
		BankPrototype bank = new BankPrototype();
		
		List<String> service = new ArrayList<>();
		for(String s: this.getServices())
			service.add(s);
		
		bank.setServices(service);
		return bank;
	}
}
