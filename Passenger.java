package carsharing;

public class Passenger {
	private String name;
	private int destination;
	public Passenger(String name, int dest) {
		this.name = name;
		this.destination = dest;
	}
	public int getDestination() {
		return destination;
	}
	public String toString() {
		return ""+name+"->"+destination+"";
	}
}
