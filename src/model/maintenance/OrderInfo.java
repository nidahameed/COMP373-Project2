package model.maintenance;
import java.util.*;

public class OrderInfo {
	
	private static final double capacity = 100;
	ArrayList <Integer> listMaintenance= new ArrayList();
	public ArrayList<Integer> getListMaintenance() {
		return listMaintenance;
	}
	public void setListMaintenance(ArrayList<Integer> listMaintenance) {
		this.listMaintenance = listMaintenance;
	}
	Date orderDate; 
	int maintCost=600; 
	
	public OrderInfo() {
		
	}
	public int getMaintCost() {
		return maintCost;
	}
	public void setMaintCost() {
		this.maintCost = maintCost;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate() {
		Date today = Calendar.getInstance().getTime();
		orderDate=today;
		this.orderDate = orderDate;
	}
	public int calcMaintenanceCostForFacility() {
		int totalCost= listMaintenance.size()*maintCost; 
		return totalCost;
	}
	public double calcProblemRateforFacility() {
		double problemRate;
		problemRate= (listMaintenance.size()/capacity)*100; 
		return problemRate; 
	}
	

}
