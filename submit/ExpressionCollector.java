package expressions;

import java.util.ArrayList;
import java.util.List;

public class ExpressionCollector {
	 
	protected List<Expression> expressions;
	protected Object value;
	protected String defaultValue;
	 
	
	ExpressionCollector() {
		// COMPLETE THIS create an empty collection of expression
		 expressions = new ArrayList<>();
	}
	
	/**
	 * Add a new expression.
	 * @param e an expression
	 */
	void addExpression(Expression e) {
		// COMPLETE THIS
		expressions.add(e);
	}
	
	/**
	 * Add a new expression.
	 * @param left integer value of the left operand 
	 * @param op operator (i.e., "+", "-", "*", ">", "<", "==")
	 * @param right integer value of the right operand
	 */
	void addExpression(int left, String op, int right) {
		// COMPLETE THIS
		// Hint: Depending on the operator given (e.g., +), create the corresponding expression object
		// (e.g., Addition) and add it to the collector.
		if(op.equals("+")) {
			Expression add = new Addition(left, right);
			add.evaluate();
			expressions.add(add);
		}
		if(op.equals("-")) {
			Expression mins = new Subtraction(left, right);
			mins.evaluate();
			expressions.add(mins);
		}
		if(op.equals("*")) {
			Expression mul = new Multiplication(left, right);
			mul.evaluate();
			expressions.add(mul);
		}
		if(op.equals(">")) {
			Expression greater = new GreaterThan(left, right);
			greater.evaluate();
			expressions.add(greater);
		}
		if(op.equals("<")) {
			Expression less = new LessThan(left, right);
			less.evaluate();
			expressions.add(less);
		}
		if(op.equals("==")) {
			Expression equal = new Equal(left, right);
			equal.evaluate();
			expressions.add(equal);
		}
		
	}
	
	/**
	 * sub-routine that can be used to check if this is type correct
	 * true if e is one of the three classes, or their subclasses (if any)
	 * so use instanceof, instead of getClassName()
	 */
	private boolean isArithmetic(Expression e) {
		return 
				e instanceof Addition 
			||	e instanceof Subtraction
			|| 	e instanceof Multiplication;
	}
	
	/**
	 * sub-routine that can be used to check if this is type correct
	 * true if e is one of the three classes, or their subclasses (if any)
	 */
	private boolean isRelation(Expression e) {
		return 
				e instanceof Equal 
			||	e instanceof GreaterThan
			|| 	e instanceof LessThan;
	}
	
	/**
	 * If this collector is AddAll or TimesAll, then all stored expressions must be integer expressions
	 * (i.e., Addition, Subtraction, Multiplication).
	 * If this collection is ConjoinAll or DisjoinAll, then all stored expressions must be boolean expressions
	 * (i.e., GreaterThan, LessThan, Equal)
	 * @return whether it is possible to evaluate the stored collection of expressions.   
	 */
	boolean isTypeCorrect() {
		// COMPLETE THIS
		boolean r = true;
		if(this instanceof AddAll||this instanceof TimesAll) {
			for(int i=0; i<expressions.size();i++) {
				r = r && this.isArithmetic(expressions.get(i));
			}
		}else if(this instanceof ConjoinAll || this instanceof DisjoinAll){
			for(int i=0; i<expressions.size();i++) {
				r = r && this.isRelation(expressions.get(i));
			}
		}
			else {
				r = false;
			}
		return r;
	}
	
	/**
	 * Get the result of the latest evaluation (i.e., after the latest call to `evaluate()`).
	 * @return the last evaluation result.
	 */
	Object getValue() {
		this.evaluate();
		return this.getValue();
	}
	
	/**
	 * Obtain the list of stored expressions, as an array.
	 * @return all stored expressions as an array
	 */
	Expression[] getExpressions() {
		// COMPLETE THIS
		Expression[] expression = new Expression[expressions.size()];
		for(int i=0; i<expressions.size();i++) {
			expression[i] = expressions.get(i);
		}
		return expression;
	}
	
	/**
	 * Given that this expression collector is type correct (see `isTypeCorrect()`),
	 * evaluate it. Store the evaluation result so that it can be returned by `getValue()`. 
	 */
	void evaluate() {
		// Hint: Leave this empty and override it in all subclasses such as Addition, GreaterThan.
	}
	
	/**
	 * Override the equals method. Two expression collectors are equals if:
	 * 1) They are both type correct 2) Their evaluation results are identical
	 * @return whether or not the two expression collectors are equal.
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || this.getClass() != obj.getClass()) {
			return false;
		}
		ExpressionCollector other = (ExpressionCollector) obj;
		if(this.isTypeCorrect() && other.isTypeCorrect()) {
			this.evaluate();
			other.evaluate();
			if(this.getValue().equals(other.getValue())) {
				return true;
			}else {
				return false;
			}
		}
		else {
			return false;
		}
		
			 
	}
	
	
}
