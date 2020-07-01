package fms;

public class PassengerInfo implements Comparable<PassengerInfo> {
	String name;
	double TicketAmount;
	int FlightId;

	public PassengerInfo(String name,double TicketAmount ,int FlightId ) {
		this.name = name;
		this.TicketAmount = TicketAmount;
		this.FlightId = FlightId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTicketAmount() {
		return TicketAmount;
	}

	public void setTicketAmount(double ticketAmount) {
		TicketAmount = ticketAmount;
	}

	public int getFlightId() {
		return FlightId;
	}

	public void setFlightId(int flightId) {
		FlightId = flightId;
	}

	public int compareTo(PassengerInfo other) {
		if(this.TicketAmount>other.TicketAmount) {
			return 1;
		}
		if(this.TicketAmount<other.TicketAmount) {
			return -1;
		}
		else {
			if(this.FlightId>other.FlightId) {
				return -1;
			}
			if(this.FlightId<other.FlightId) {
				return 1;
			}
			else return 0;
		}
	}

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (this.getClass() != o.getClass())
			return false;
		PassengerInfo p = (PassengerInfo) o;
		if (p.getName() == this.getName() && p.getFlightId() == this.getFlightId()
				&& p.getTicketAmount() == this.getTicketAmount())
			return true;
		return false;
	}

}
