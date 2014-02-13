package com.rulusoft.patterns.abstract_factory;

public abstract class PhoneNumber {
	
	private String phoneNumber;
	private String codeCountry;
	
	public PhoneNumber(String phoneNumber, String codeCountry, int numNumbers){
		if (phoneNumber.length() == numNumbers){
			this.phoneNumber = phoneNumber;
			this.codeCountry = codeCountry;
		}
	}
	
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	public String getCodeCountry(){
		return codeCountry;
	}
	
	public abstract String getPhoneNumberWithFormat();

}
