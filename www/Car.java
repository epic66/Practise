package carsharing;

import java.util.ArrayList;

public class Car {
	private int idNo;
	private int destination;
	private int location;
	private ArrayList<Passenger>passengers = new ArrayList<>();
	private double faresCollected;
	private int milesDriven;
	private double FAREPERMILE = 1.0;
	private int MAXPASSENGERS = 3;
	public Car(int idNo, int location, int destination) {
		this.idNo = idNo;
		this.location = location;
		this.destination = destination;
	}
	public int getIdNo() {
		return this.idNo;
	}
	public int getDestination() {
		return this.destination;
	}
	public int getLocation() {
		return this.location;
	}
	public ArrayList<Passenger> getPassengers() {
		return passengers;
	}
	public double getFares() {
		return faresCollected;
	}
	public int getMilesDriven() {
		return milesDriven;
	}
	public boolean hasArrived() {
		if(location==destination) {
			return true;
		}
		return false;
	}
	public boolean hasRoom() {
		if(passengers.size()<MAXPASSENGERS) {
			return true;
		}
		return false;
	}
	public void drive() {
		if(location<destination) {
			location++;
			faresCollected += FAREPERMILE*passengers.size();
			System.out.println("Car "+idNo+" drives to station "+location);
			milesDriven++;
		}
	}
	public boolean dropOff() {
	//	boolean result = false;
		for(int i=passengers.size()-1;i>=0;i--) {
			if(passengers.get(i).getDestination()==getLocation()) {		
				System.out.println("Car "+idNo+" drops off "+passengers.get(i)+" at station "+location+". Car now has "+(passengers.size()-1)+" passengers");
				passengers.remove(i);
				continue;
			}
			return true;
		}
		return false;
	}
	public boolean add(Passenger p) {
		boolean result = false;
		if(hasRoom()) {
			result= true;
			passengers.add(p);
			return result;
		}
		return result;
	}
	public String toString() {
		return "Car[idNo="+idNo+", location="+location+", destination="+destination+", passengers="+passengers+"]";
	}

//	ArrayList<Passenger> Remove = new ArrayList<Passenger>();
//	boolean result = false;
//	for(int i=0;i<passengers.size();i++) {
//		if(passengers.get(i).getDestination()==getLocation()) {
//			Remove.add(passengers.get(i));
//			result = true;
////		/	return result;
//		}
//	}
//	for(int j=0; j<Remove.size();j++) {
//		if(result == true) {
//			passengers.remove(Remove.get(j));
//			System.out.println("Car "+idNo+" drops off "+passengers.get(j)+" at station "+location+". Now has "+passengers.size()+" passengers");
//			return result;
//		}
//	}
//	return result;
}
