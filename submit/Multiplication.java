package expressions;

public class Multiplication extends Expression{
	Multiplication(int left, int right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}
	public void evaluate() {
		super.evaluate();
		value = left * right;
	}
}
