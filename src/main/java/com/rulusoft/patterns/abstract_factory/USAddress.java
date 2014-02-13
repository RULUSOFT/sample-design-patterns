package com.rulusoft.patterns.abstract_factory;

public class USAddress extends Address {
	
	 public USAddress(String street, String city, String region,
			String postalCode) {
		super(street, city, region, postalCode);
	}

	private static final String COUNTRY = "UNITED STATES";
     private static final String COMMA = ",";

	@Override
	public String getCountry() {
		return COUNTRY;
	}
	
	public String getFullAddress(){
		return getStreet() + COMMA + getCity() + COMMA + getRegion() + COMMA + getPostalCode();
	}

}
