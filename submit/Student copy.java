package studentSystem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Student {
	
	static int serial = 0;    // non-private for testing
	String name;   // non-private for testing
	int year;   // non-private for testing
	String yorkID;    // non-private for testing
	Date joinDate;     // non-private for testing
	Set<Course> courses = new HashSet<>();   // assume no duplicate courses so use a set  // non-private for testing
	List<GPA> GPAs = new ArrayList<>();  // non-private for testing
	
	
	/**
	 * create a student with empty courses and GPAs
	 */
	public Student() {
		this.setYorkID(String.format("York-%02d", ++Student.serial));
	}
	
	
	
	public Student(String name, int year, Date joinDate, Set<Course> courses, List<GPA> gpas) {
		this.name = name;
		this.year = year;
		Date copyDate = new Date(joinDate.getYear(), joinDate.getMonth());
		this.joinDate = copyDate;
		List<GPA> copygpa = new ArrayList<GPA>();
		for(int i=0; i<gpas.size();i++) {
			copygpa.add(new GPA(gpas.get(i).getYear(),gpas.get(i).getGPA()));
		}
		this.GPAs = copygpa;
		Set<Course> copycourse = new HashSet<Course>(courses);
		for(Course a: courses) {
			copycourse.add(a);
		}
		this.courses = copycourse;
		
		
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the id
	 */
	public String getYorkID() {
		return this.yorkID;
	}
	
	
	/**
	 * @param id the id to set
	 */
	public void setYorkID(String id) {
		this.yorkID = id;
	}
	
	
	/**
	 * @return the joinDate
	 */
	public Date getJoinDate() {
		Date copyDate = new Date(joinDate.getYear(),joinDate.getMonth());
		return copyDate;
	}	
	
	
	/**
	 * @param joinDate the joinDate to set
	 */
	public void setJoinDate(Date joinDate) {
		Date copyDate = new Date(joinDate.getYear(),joinDate.getMonth());
		this.joinDate = copyDate;
	}
	
	
	/**
	 * @return the course
	 */
	public Set<Course> getCourses() {
		Set<Course> copycourse = new HashSet<Course>(this.courses);
		for(Course a: this.courses) {
			copycourse.add(a);
		}
		return copycourse;
	}
	
	
	/**
	 * @param courses the course to set
	 */
	public void setCourses(Set<Course> courses) {
		Set<Course> copycourse = new HashSet<Course>(courses);
		for(Course a: courses) {
			copycourse.add(a);
		}
		this.courses = copycourse;
	}
	
	
	/**
	 * @return the gpas
	 */
	public List<GPA> getGPAs() { // need deep copy
		List<GPA> copygpa = new ArrayList<GPA>();
		for(int i=0; i<this.GPAs.size();i++) {
			copygpa.add(new GPA(this.GPAs.get(i).getYear(),this.GPAs.get(i).getGPA()));
		}
		return copygpa;
	}
	
	/**
	 * @param gpas the gpas to set
	 */
	public void setGPAs(List<GPA> gpas) {
		List<GPA> copygpa = new ArrayList<GPA>();
		for(int i=0; i<gpas.size();i++) {
			copygpa.add(new GPA(gpas.get(i).getYear(),gpas.get(i).getGPA()));
		}
		this.GPAs = copygpa;
	}


	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}


	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
}
