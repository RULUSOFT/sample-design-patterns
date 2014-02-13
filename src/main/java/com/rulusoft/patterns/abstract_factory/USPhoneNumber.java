package com.rulusoft.patterns.abstract_factory;

public class USPhoneNumber extends PhoneNumber {
	
	private static final String COUNTRY_CODE = "01";
    private static final int NUMBER_LENGTH = 10;
	
	public USPhoneNumber(String phoneNumber) {
		super(phoneNumber, COUNTRY_CODE, NUMBER_LENGTH);
	}

	@Override
	public String getPhoneNumberWithFormat() {
		return COUNTRY_CODE + " ** " + super.getPhoneNumber();
	}

}
