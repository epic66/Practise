package expressions;

public class ConjoinAll extends ExpressionCollector{
	ConjoinAll(){
		super();
	}
	public void evaluate() {
		super.evaluate();
		boolean result = true;
		for(int i = 0; i<expressions.size();i++) {
			expressions.get(i).evaluate();
			result = (boolean)expressions.get(i).getValue()&&result;
		}
		this.value = result;
	}
	Object getValue() {
		return this.value;
	}
}
