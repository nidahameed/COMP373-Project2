package model.facility;
import java.util.*;

public class FacilityDetails {
	
	private static final double capacity=100;
	int facilityID;
	int useInterval; 
	double availableCapacity= 0;
	ArrayList<Integer> FacilityList= new ArrayList<Integer>(); 
	
	public FacilityDetails() {
		
	}
	
	public int inUseDuringInterval() {
		//This is the renter's lease length. 12 months. how many years they are renting 
		useInterval=12;
		return useInterval;
	}
	public String addFacilityDetail() {
		//TODO Add address update later. 
		String facilityInfo= "Available Capacity: " + requestAvailableCapacity() 
		+ "\nID:"+ facilityID;
		return facilityInfo;
		
	}
	public double requestAvailableCapacity() {
		availableCapacity= (getCapacity()- getFacilityList().size());	
		return availableCapacity;
	}
	public int calcDownTimeForFacility() {
		//the time b/n renters when you can do inspections etc. 1 month
		int downTime= 1; 
		return downTime;
		
	}
	public void getFacilityInformation() {
		
		System.out.println(addFacilityDetail());
		
	}
	public ArrayList<Integer> getFacilityList() {
		return FacilityList;
	}
	public void setFacilityList(ArrayList<Integer> facilityList) {
		FacilityList = facilityList;
	}
	public double calcUsageRate(double capacity, double availableCapacity) {
		//the percentage of our facility being rented at the time, if capacity ever changes from 100.
		//the equation is ((capacity-requestAvailableCapacity())/capacity)*100)
		double usageRate= (capacity-requestAvailableCapacity()/capacity *100);
		return usageRate;
	}
	public void listActualUsage() {
		System.out.println("Facility is currently renting " +getFacilityList().size()+
				" out of "+getCapacity()+ " units"); 
	}
	public static double getCapacity() {
		return capacity;
	}
	
}
