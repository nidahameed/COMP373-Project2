package model.facility;
import java.util.*;

public class Facility extends FacilityRequest implements IFacility {
	
	
	public Facility() {
		
	}
	

	public int getFacilityID() {
		return facilityID;
	}

	public void setFacilityID(int facilityID) {
		this.facilityID = facilityID;
	}

	@Override
	public void listFacilities() {
		// TODO print out the list
		//this prints out the list of the facilities
		for(int i=0;i<FacilityList.size();i++) {
			System.out.println(FacilityList.get(i));
		}
	}
	
	public int createFacility() {
		//TODO use getFacility to create a new one and add to FacilityList
		//this function creates a new facility and then then it is added to our Facility list
		int newFacility= facilityID++; //increments to assign facility ID every time a new one is created
		FacilityList.add(newFacility); //added to FacilityList here
		return facilityID;
	}
	public void removeFacility(int facilityID) {
		//TODO remove the given ID from FacilityList 
		for(int i=0;i<FacilityList.size();i++) {
			if(facilityID== FacilityList.get(i))
				FacilityList.remove(i);
		}
	}
	public ArrayList<Integer> getFacilityList() {
		return FacilityList;
	}
	public void setFacilityList(ArrayList<Integer> facilityList) {
		FacilityList = facilityList;
	}
	
	
	
	
}
