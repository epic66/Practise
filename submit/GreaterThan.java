package expressions;

public class GreaterThan extends Expression{

	GreaterThan(int left, int right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	
	public void evaluate() {
		super.evaluate();
		value = left > right;
	}
}
