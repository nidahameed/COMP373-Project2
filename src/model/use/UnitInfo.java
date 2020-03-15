package model.use;
import java.util.*;


public class UnitInfo implements IUse {
	String name;
	String unitNumber; 
	ArrayList<String> UnitList= new ArrayList();
	protected static HashMap<String, String> roster= new HashMap<String,String>(); //unitNum and Name
	public UnitInfo() {
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;  
	}
	public  String getUnitNumber() {
		//generates a unit number. random number generator for floor between 1 and 10 and a letter. 
		// debug: check for duplicates
		generateNum();
		for(int i=0;i<UnitList.size();i++){
			if(UnitList.get(i).equals(unitNumber))
				generateNum();
		}
		return unitNumber;
		
	}
	public String generateNum() {
		int num= ((int) (Math.random()*(10-1))) + 1; 
		Random rnd= new Random();
		char c= (char) (rnd.nextInt(26) + 'a');
		unitNumber= Integer.toString(num)+ Character.toString(c); 
		return unitNumber;
	}
	@Override
	public void listUnitInfo() {
		
		for(String i: roster.keySet()) {
			System.out.println("key: "+i +"value: "+ roster.get(i));
		}
	}
	 String facilityAddress;
	public String getFacilityAddress() {
		return facilityAddress= "6301 N Sheridan Chicago,IL 60660";
	}
}
