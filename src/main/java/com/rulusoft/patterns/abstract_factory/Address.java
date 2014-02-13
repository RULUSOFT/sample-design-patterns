package com.rulusoft.patterns.abstract_factory;

public abstract class Address {
	
	private String street;
	private String city;
	private String region;
	private String postalCode;
	
	public Address(String street, String city, String region, String postalCode){
		this.street = street;
		this.city = city;
		this.region = region;
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}



	public String getCity() {
		return city;
	}



	public String getRegion() {
		return region;
	}



	public String getPostalCode() {
		return postalCode;
	}



	public abstract String getCountry();
	
	public abstract String getFullAddress();

}
