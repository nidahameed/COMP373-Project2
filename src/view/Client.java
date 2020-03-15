package view;
import java.util.*;

import model.use.UnitInfo;
import model.facility.Facility;
import model.facility.FacilityDetails;
import model.maintenance.MaintenanceService;
import model.maintenance.Order;
import model.maintenance.OrderInfo;
public class Client extends UnitInfo{
	
	public static void main(String args [] ) {
	
	//facilityTest
		Facility facility = new Facility(1);
	facility.createFacility();
	System.out.println("New Facility added! The Facility ID is: " + facility.getFacilityID());
	facility.createFacility();
	System.out.println("New Facility added! The Facility ID is: " + facility.getFacilityID());
	facility.createFacility();
	System.out.println("New Facility added! The Facility ID is: " + facility.getFacilityID());
	facility.createFacility();
	System.out.println("New Facility added! The Facility ID is: " + facility.getFacilityID());
	facility.removeFacility(1); //removing facility with the ID 1
	facility.vacateFacility();
	System.out.println("Total facilities: "+ facility.getFacilityList().size());
	System.out.println("Facility IDs: ");
	facility.listFacilities(); //print list facilities (this was the missing functionality that was added
	
	facility.listActualUsage();
	facility.getFacilityInformation();
	System.out.println("Rentals length: " +facility.inUseDuringInterval());
	System.out.println("Facility Type:"+facility.assignFacilityToUse());
	System.out.println("The usage rate is: "+ facility.calcUsageRate(facility.getCapacity(), facility.requestAvailableCapacity()) + "%");
	
	//Maintenance test
	MaintenanceService orders = new MaintenanceService();
	orders.addOrder();
	System.out.println("New order added! Order ID:"+ orders.getOrderID());
	orders.setOrderDate();
	System.out.println("New order added! Order ID:"+ orders.getOrderID());
	orders.setOrderDate();
	System.out.println("New order added! Order ID:"+ orders.getOrderID());
	orders.setOrderDate();
	System.out.println("Order Date: "+ orders.getOrderDate());
	orders.addOrder();
	System.out.println("New order added! Order ID:"+ orders.getOrderID());
	orders.addOrder();
	System.out.println("New order added! Order ID:"+ orders.getOrderID());
	orders.deleteOrder(orders.getOrderID());
	orders.setMaintCost();
	System.out.println("Maintenance Cost per request: " + orders.getMaintCost());
	System.out.println("Total Maintenance:"+ orders.calcMaintenanceCostForFacility());
	System.out.println("The problem rate for facility is: "+ orders.calcProblemRateforFacility()+"%");
	Date d1= new Date(20, 3, 1); 
	orders.setScheduleDate(d1);
	System.out.println("Schedule Date:"+ orders.getScheduleDate());
	System.out.print("Inspection types: ");
	orders.listInspections();
	System.out.print("Maintenance list by ID: ");
	orders.listMaintenance();
	System.out.print("Facility problems List: ");
	orders.setFacilityProblems();
	orders.listFacilityProblems();
	
	//use Test
	
	UnitInfo renter1= new UnitInfo(); 
	UnitInfo renter2= new UnitInfo();
	renter1.setName("Mojo Jojo");
	System.out.println("New resident! Name: "+renter1.getName()+" in Unit: "+ renter1.getUnitNumber());
	renter2.setName("Jimmy Neutron");
	System.out.println("New resident! Name: "+ renter2.getName()+ " in Unit: "+ renter2.getUnitNumber());
	System.out.println("Facility Address: "+ renter1.getFacilityAddress());
	
	
	
	
	


	
	
	
	}


}
