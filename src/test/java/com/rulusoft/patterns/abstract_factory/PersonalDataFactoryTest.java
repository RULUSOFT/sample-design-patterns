package com.rulusoft.patterns.abstract_factory;

import org.junit.Test;

public class PersonalDataFactoryTest {

	@Test
	public void shouldCreatePersonalDataOfUSPerson() {
		USPersonalDataFactory personalDataUSPerson = new USPersonalDataFactory();
		USAddress address = personalDataUSPerson.createAddress("Major", "New York", "NY", "5555");
		USPhoneNumber phone = personalDataUSPerson.createPhoneNumber("3456789123");
		
		System.out.println(address.getFullAddress());
		System.out.println(phone.getPhoneNumberWithFormat());
	}

}
