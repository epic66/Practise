package carsharing;

import java.util.ArrayList;

public class Station {
	private int stationNumber;
	private ArrayList<Passenger>people = new ArrayList<>();
	public Station(int number) {
		this.stationNumber = number;
	}
	public int getNumber() {
		return stationNumber;
	}
	public void add(Passenger p) {
		people.add(p);
	}
	public Passenger get(int index) {
		return people.get(index);
	}
	public Passenger remove(int index) {
		return people.remove(index);
	}
	public ArrayList<Passenger> peopleWaitingList(){
		return people;
	}
	public String toString() {
		return ""+people+"";
	}
}
