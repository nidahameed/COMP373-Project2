package model.facility;

public class FacilityRequest extends FacilityDetails{
	
	public FacilityRequest() {
		
	}
	public String assignFacilityToUse() {
		String facilityUse= "apartment";
		return facilityUse;
	}
	public void vacateFacility() {
		for(int i=0;i<getFacilityList().size();i++) {
			if(facilityID== getFacilityList().get(i))
				getFacilityList().remove(i);
		}
	}
	

}
