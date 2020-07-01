package studentSystem;


public class Date extends java.lang.Object{
	int month;
	int year;
	public Date(int year, int month) {
		this.year = year;
		this.month = month;
		if(year<0||month<1||month>12) {
			throw new java.lang.IllegalArgumentException();
		}
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) throws java.lang.IllegalArgumentException{
		if(month<1||month>12) {
			throw new java.lang.IllegalArgumentException();
		}
		else {
			this.month = month;
		}
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) throws java.lang.IllegalArgumentException{
		if(year<0) {
			throw new java.lang.IllegalArgumentException();
		}else {
			this.year = year;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + month;
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
		Date other = (Date) obj;
		if (month != other.month)
			return false;
		if (year != other.year)
			return false;
		return true;
	}
	
}
