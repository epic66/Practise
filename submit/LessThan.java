package expressions;

public class LessThan extends Expression{

	LessThan(int left, int right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public void evaluate() {
		super.evaluate();
		value = left < right;
	}
}
