package com.designpattern.creational.builder;

public class Bank {
	private String bankName;
	private float plIntrest;
	private float hlIntrest;
	private float glIntrest;
	private Boolean isPhoneBanking;
	private Boolean isOnlineBanking;
	
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", plIntrest=" + plIntrest + ", hlIntrest=" + hlIntrest + ", glIntrest="
				+ glIntrest + ", isPhoneBanking=" + isPhoneBanking + ", isOnlineBanking=" + isOnlineBanking + "]";
	}

	public Bank(String bankName, float plIntrest, float hlIntrest, float glIntrest, Boolean isPhoneBanking,
			Boolean isOnlineBanking) {
		super();
		this.bankName = bankName;
		this.plIntrest = plIntrest;
		this.hlIntrest = hlIntrest;
		this.glIntrest = glIntrest;
		this.isPhoneBanking = isPhoneBanking;
		this.isOnlineBanking = isOnlineBanking;
	}

	

}

