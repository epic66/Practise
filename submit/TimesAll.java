package expressions;

public class TimesAll extends ExpressionCollector{
	TimesAll(){
		super();
	}
	public void evaluate() {
		super.evaluate();
		int a = 1;
		for(int i=0; i<expressions.size();i++) {
			expressions.get(i).evaluate();
			a = a * (Integer)expressions.get(i).getValue();
		}
		this.value = a;
	}
	Object getValue(){
		return this.value;
	}
}
