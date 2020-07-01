package expressions;

public class Equal extends Expression{
	Equal(int left, int right) {
		super(left, right);
		// TODO Auto-generated constructor stub
	}

	public void evaluate() {
		super.evaluate();
		value = left == right;
	}
}
