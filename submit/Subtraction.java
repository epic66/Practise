package expressions;

public class Subtraction extends Expression{
	Subtraction(int left, int right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public void evaluate() {
		super.evaluate();
		value = left - right;
	}
}
