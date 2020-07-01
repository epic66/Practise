package fms;

public class FlightInfo {
	String name;
	String airline;

	public FlightInfo(String name, String airline) {
		this.name = name;
		this.airline = airline;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getairline() {
		return this.airline;
	}

	public void setairline(String airline) {
		this.airline = airline;
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		FlightInfo f = (FlightInfo) o;
		if (f.getairline() == this.getairline() && f.getName() == this.getName())
			return true;
		return false;
	}

}
