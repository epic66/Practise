package expressions;

public class AddAll extends ExpressionCollector{
	protected Object value;
	AddAll(){
		super();
	}
	
	public void evaluate() {
		super.evaluate();
		int a = 0;
		for(int i=0; i<expressions.size();i++) {
			expressions.get(i).evaluate();
			a = a + (Integer)expressions.get(i).getValue();
		}
		this.value = a;
	}
	Object getValue() {
		return this.value;
	}	
}
