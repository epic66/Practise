package expressions;

public class Addition extends Expression{
	Addition(int left, int right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	
	public void evaluate() {
		super.evaluate();
		value = left+right;
	}
}
