package com.rulusoft.patterns.abstract_factory;

public interface PersonalDataFactory {
	
	public Address createAddress (String street, String city, String region, String postalCode);
	
	public PhoneNumber createPhoneNumber(String phoneNumber);

}
