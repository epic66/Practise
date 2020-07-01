package lab1package3;

public class TourismBook {
	private Attraction[] attractions;
	private int numOfAttractions;
	public TourismBook() {
		attractions = new Attraction[0];
		numOfAttractions = 0;
	}
	public Attraction[] getAttractions() {
		return attractions;
	}
	public void addAttraction(Attraction c) {
		numOfAttractions ++;
		Attraction[] t = attractions;
		attractions = new Attraction[numOfAttractions];
		for(int i=0; i < t.length; i++) {
			attractions[i] = t[i];
		}
		attractions[numOfAttractions - 1] = c;
	}
	public void addAttraction(String n, double p) {
		numOfAttractions ++;
		Attraction[] q = attractions;
		attractions = new Attraction[numOfAttractions];
		for(int i=0; i<q.length; i++) {
			attractions[i] = q[i];
		}
		Attraction b = new Attraction(n, p);
		attractions[numOfAttractions-1] = b;
		
	}
	public String nameBestAttraction() {
		double min = 0.0;
		for(int i=0; i<numOfAttractions ;i++) {
			if(attractions[i].getPrice()>min) {
				min = attractions[i].getPrice();
				return attractions[i].getName();
			}
		}
		return "Something goes wrong";
	}
}
