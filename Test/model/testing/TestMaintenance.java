package model.testing;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.maintenance.*;

class TestMaintenance {

	MaintenanceService maintenance = new MaintenanceService();

	
	@BeforeEach
	void setUp() throws Exception {
		maintenance.setFacilityProblems();
		maintenance.setMaintCost();
		maintenance.setOrderID(1);

	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testAddOrder() {
		maintenance.addOrder();
		maintenance.addOrder();
		assertEquals(2, maintenance.getListMaintenance().size());
		//creating two orders here to test the addOrder function
		//created two orders and then checked if it was reflected in the ListMaintenance
	}
	
	@Test
	void testDeleteOrder() {
		//created two orders and then deleted the order with the ID of 1
		maintenance.addOrder();
		maintenance.addOrder();
		maintenance.deleteOrder(1); //deleting order with the ID of 1
		assertEquals(1, maintenance.getListMaintenance().size());
		//the deleteOrder function is removing the order from ListMaintenance and the test shows this
	}
	
	@Test
	void getCalcMaintenanceCostForFacility() {
		//maintCost is $600
		//tested by creating two orders 
		maintenance.addOrder();
		maintenance.addOrder();
		assertEquals(1200, maintenance.calcMaintenanceCostForFacility());
		//the expected was 1200 because there are 2 orders and each would cost $600 and the test shows this
	}

	
	@Test
	void getCalcProblemRateforFacility() {
		maintenance.addOrder();
		assertEquals(1, maintenance.calcProblemRateforFacility());
		//testing the percentage of problems in the entire facility
		//based on the calculation that is done to get problemRate, the expected is one which is confirmed by the test
	}
	
	@Test
	void testListMaintenance() {
		maintenance.addOrder();
		assertEquals(1, maintenance.getListMaintenance().size());	
		//testing ListMaintenance to see if orders are being added as they should be 
		//created an order and them checked to see if it was properly in the ListMaintenace
	}
}
