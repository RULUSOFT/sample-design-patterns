package com.rulusoft.patterns.abstract_factory;

public class USPersonalDataFactory implements PersonalDataFactory{

	public USAddress createAddress(String street, String city, String region, String postalCode) {
		return new USAddress(street, city, region, postalCode);
	}

	public USPhoneNumber createPhoneNumber(String phoneNumber) {
		return new USPhoneNumber(phoneNumber);
	}
	
}
