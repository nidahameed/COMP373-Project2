package model.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.facility.Facility;

class TestFacility {

	Facility facility = new Facility(10);
	
	@BeforeEach
	void setUp() throws Exception {
		facility.getFacilityList();
		facility.setFacilityID(1);
	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCreateFacility() {
		facility.createFacility();
		facility.createFacility();
		assertEquals(2, facility.getFacilityList().size());
		//shows that createFacility method is adding to the FacilityList 
		//expected size is 2 after creating two facilities and the test shows this
	}
	
	@Test
	void testRemoveFacility() {
		facility.removeFacility(1);
		assertEquals(0, facility.getFacilityList().size());
		//shows that the facility created in the setup has now been removed through the removeFacility function
		//the expected is 0 and the test confirms this
	}
	
	@Test
	void testListFacilities() {
		//test showing that the each facility created 
		facility.createFacility();
		assertEquals(1, facility.getFacilityList().size());
	}
	
	
	@Test
	void testAssignFacilityToUse() {
		facility.createFacility();
		String use = facility.assignFacilityToUse();
		assertEquals("apartment", use);
	}
	
	@Test
	void testVacateFacility() {
		facility.createFacility();
		facility.createFacility();
		facility.vacateFacility();
		assertEquals(2, facility.getFacilityList().size());
		//vacateFacility empties the facility but it is still being used, so therefore the list size should still be 2
		//facility is vacated, not removed and this test shows that it is only vacated and not affecting the size
	}
	
	@Test
	void testInUseDuringInterval() {
		facility.createFacility();
		assertEquals(12, facility.inUseDuringInterval());
		//useInterval is set to 12 and this test shows that the facility creates has a useInterval of 12
	}
	
	@Test
	void testAddFacilityDetail() {
		facility.createFacility();
		assertEquals("Available Capacity: 99.0\n ID:2", facility.addFacilityDetail());
		
	}
	
	@Test
	void testRequestAvailableCapacity() {
		facility.createFacility();
		facility.createFacility();
		facility.createFacility();
		facility.createFacility();
		facility.createFacility();
		assertEquals(95, facility.requestAvailableCapacity());
		//the available capacity is the total capacity minus the size of FacilityList
		//our facility has a set capacity of 100 and after creating 5 facilities
		//there are 95 facilities available and the tests shows this
	}
	
	@Test
	void testCalcDownTimeForFacility() {
		facility.createFacility();
		assertEquals(1, facility.calcDownTimeForFacility());
		//our down time in between facilities is set to one month and this test shows that
	}
	
	
	@Test
	void testCalcUsageRate() {
		facility.createFacility();
		facility.createFacility();
		facility.createFacility(); //created three facilities 
		assertEquals(3, facility.calcUsageRate(facility.getCapacity(), facility.requestAvailableCapacity()));
		//the usage rate should be 3% since 3 out of a 100 facilities and this test confirms that the method is portraying that
		
	}
}
