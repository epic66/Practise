package lab1package2;

public class Rectangle {
	private int h;
	private int w;
	
	public Rectangle() {
		h = 0;
		w = 0;
	}
	public Rectangle(int h, int w) {
		this.h = h;
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public int getW() {
		return w;
	}
	public int getA() {
		return h*w;
	}
	public void setH(int newH) {
		this.h = newH;
	}
	public void setW(int newW) {
		this.w = newW;
	}
	public String toString() {
		return "the height, width, and area of the rectangle is : "+this.h+", "+this.w+", "+getA();
	}
}
