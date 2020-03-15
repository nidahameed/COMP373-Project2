package model.maintenance;
import java.util.*;

public class Order extends OrderInfo {

	int orderID=0;
	//private ArrayList <Integer> orderList= new ArrayList();

	public Order() {
		
	}
	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int addOrder() {
		int newOrder= orderID++;
		listMaintenance.add(newOrder);
		return orderID;
	}
	public void deleteOrder(int orderID) {
		for(int i=0;i<listMaintenance.size();i++) {
			if(orderID== listMaintenance.get(i))
				listMaintenance.remove(i);
		}
	}
}
