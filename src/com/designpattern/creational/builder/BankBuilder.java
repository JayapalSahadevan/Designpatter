package com.designpattern.creational.builder;

public class BankBuilder {
	
	private String bankName;
	private float plIntrest;
	private float hlIntrest;
	private float glIntrest;
	private boolean isPhoneBanking;
	private boolean isOnlineBanking;
	
	public BankBuilder setBankName(String bankName) {
		this.bankName = bankName;
		return this;
	}
	public BankBuilder setPlIntrest(float plIntrest) {
		this.plIntrest = plIntrest;
		return this;
	}
	public BankBuilder setHlIntrest(float hlIntrest) {
		this.hlIntrest = hlIntrest;
		return this;
	}
	public BankBuilder setGlIntrest(float glIntrest) {
		this.glIntrest = glIntrest;
		return this;
	}
	public BankBuilder setPhoneBanking(boolean isPhoneBanking) {
		this.isPhoneBanking = isPhoneBanking;
		return this;
	}
	public BankBuilder setOnlineBanking(boolean isOnlineBanking) {
		this.isOnlineBanking = isOnlineBanking;
		return this;
	}
	
	public Bank build() {
		return new Bank(bankName, plIntrest, hlIntrest, glIntrest, isPhoneBanking, isOnlineBanking);
	}

}
