package fms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


public class FlightManagementSystem {
	
	/*
	 * Each entry in a 'passengers' map contains
	 * a unique  ID (this is different from the flightID defined in the passenger class), and its associated information object.
	 */
	HashMap<String, PassengerInfo> passengers;

	/*
	 * Each entry in a 'flights' map contains
	 * a unique id (this is different from the flightID defined in the passenger class) and its associated information object.
	 */
	HashMap<Integer, FlightInfo> flights;

	/**
	 * Initialize an empty database.
	 */
	public FlightManagementSystem() {
		this.passengers = new HashMap<>();
		this.flights = new HashMap<>();
	}

	/**
	 * Add a new passenger entry.
	 * @param id - id of the passenger
	 * @param info - information object of the  passenger
	 * @throws IdAlreadyExistsExceptoin if 'id' is an existing passenger id
	 */
	public void addPassenger(String id, PassengerInfo info) throws IdAlreadyExistsExceptoin {
		if(this.passengers.containsKey(id)) throw new IdAlreadyExistsExceptoin("");
		this.passengers.put(id, info);
	}

	/**
	 * Remove an existing passenger entry.
	 * @param id - id of the passenger
	 * @throws IdNotFoundException if 'id' is not an existing passenger id
	 */
	public void removePassenger(String id) throws IdNotFoundException {
		if(!this.passengers.containsKey(id)) throw new IdNotFoundException("");
		this.passengers.remove(id);
	}
	
	
	

	/**
	 * Add a new flight entry.
	 * @param id id of the flight
	 * @param info information object of the flight
	 * @throws IdAlreadyExistsExceptoin if 'id' is an existing flight id
	 */
	public void addFlight(Integer id, FlightInfo info) throws IdAlreadyExistsExceptoin {
		if(this.flights.containsKey(id)) throw new IdAlreadyExistsExceptoin("");
		this.flights.put(id, info);
	}

	/**
	 * Remove an existing flight entry.
	 * @param id id of some flight
	 * @throws IdNotFoundException if 'id' is not an existing flight
	 */
	public void removeFlight(Integer id) throws IdNotFoundException {
		if(!this.flights.containsKey(id)) throw new IdNotFoundException("");
		this.flights.remove(id);
	}

	
	
	/**
	 * Change the flight of passenger with id 'eid' to a new flight with id 'did'.
	 * 
	 * You can assume that 'did' denotes a flight different from
	 * the current flight of the passenger denoted by 'eid'.
	 * @param eid id of some passenger
	 * @param did id of some flight
	 * @throws IdNotFoundException if either eid is a non-existing passenger id or did is a non-existing flight id.
	 */
	public void changeFlight(String eid, Integer did) throws IdNotFoundException {
		if(!this.passengers.containsKey(eid)||!this.flights.containsKey(did)) throw new IdNotFoundException("");
		this.passengers.get(eid).FlightId = did;
	}

	/**
	 * Retrieve the name of passenger with id 'id'.
	 * @param id id of some passenger
	 * @return name of the passenger with id 'id'
	 * @throws IdNotFoundException if 'id' is not an existing passenger id
	 */
	public String getPassengerName(String id) throws IdNotFoundException {
		if(!this.passengers.containsKey(id)) throw new IdNotFoundException("");
		return this.passengers.get(id).name;
	}

	/**
	 * Retrieve the names of all passengers of the flight with id 'id'.
	 * If 'id' a non-existing flight id, then return an empty list.
	 * @param id id of some flight
	 * @return List of names of passengers whose flight has id 'id'
	 */
	public ArrayList<String> getPassengerNames(Integer id) {
		ArrayList <String> r = new ArrayList<>();
		for(String s:this.passengers.keySet()) {
			if(this.passengers.get(s).FlightId==id) r.add(this.passengers.get(s).getName());
		}
		return r;
	}

	/**
	 * Retrieve passengers flight information object.  
	 * @param id id of some passenger
	 * @return The information object of the passengers flight
	 * @throws IdNotFoundException if 'id' is not an existing passenger id
	 */
	public FlightInfo getFlightInfo(String id) throws IdNotFoundException {
		if(!this.passengers.containsKey(id)) throw new IdNotFoundException("");
		int fid = this.passengers.get(id).getFlightId();
		return this.flights.get(fid);
	}

	/**
	 * Retrieve a list, sorted in increasing order, 
	 * the information objects of all stored passengers.
	 * 
	 * Hints: 
	 * 1. Override the 'compareTo' method in PassengerInfo class. 
	 * 2. Look up the Arrays.sort method in Java API. 
	 * @return A sorted list of information objects of all passengers.
	 */
	public PassengerInfo[] getSortedPassengerInfo() {
		PassengerInfo[] p = new PassengerInfo[this.passengers.keySet().size()];
		int count = 0;
		for(String s:this.passengers.keySet()) {
			p[count] = this.passengers.get(s);
			count++;
		}
		Arrays.sort(p); 
		return p;
	}

	/**
	 * Retrieve the average ticket paid by all passengers in flight with id 'id'.
	 * @param id id of some flight
	 * @return average ticket paid by all passengers in a flight with id 'id'
	 * @throws IdNotFoundException if id is not an existing flight id
	 */
	public double getAverageTicketAmount(Integer id) throws IdNotFoundException {
		if(!this.flights.containsKey(id)) throw new IdNotFoundException("");
		double sum = 0;
		int num = 0;
		for(String s:this.passengers.keySet()) {
			if(this.passengers.get(s).getFlightId()==id) {
				sum += this.passengers.get(s).getTicketAmount();
				num ++;
			} 
		}
		return sum/(double)num;
	}

	
	
}