package model.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.use.*;

class TestUse {

	UnitInfo unit = new UnitInfo();
	
	@BeforeEach
	void setUp() throws Exception {
	}
	
	@AfterEach
	void tearDown() throws Exception {	
	}

	
	//Testing getUnitNumber() and generateNum() with JUnit is not possible due to 
	//our random number generator. The number should be a different outcome every time and 
	//can therefore not be predicted specifically 
	//However our output from client.java shows that it functions as should
	//this also goes for any methods which have print statements and therefore do not have an expected value
	@Test
	void testFacilityAddress() {
		assertEquals("6301 N Sheridan Chicago,IL 60660", unit.getFacilityAddress());
	}
	//testing getting the facility address

}
