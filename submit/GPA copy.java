package studentSystem;

public class GPA extends java.lang.Object{
	private double gpa;
	private int year;
	GPA(int year, double gpa){
		this.year = year;
		this.gpa = gpa;
	}
	public double getGPA() {
		return gpa;
	}
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(gpa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + year;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GPA other = (GPA) obj;
		if (Double.doubleToLongBits(gpa) != Double.doubleToLongBits(other.gpa))
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
}
