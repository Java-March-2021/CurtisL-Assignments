package calculatorII;

public class Calculator implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private double OperandOne, OperandTwo;
	private String Operation;

	public Calculator() {
		super();
	}

	public double getOperandOne() {
		return OperandOne;
	}

	public void setOperandOne(double operandOne) {
		
		this.OperandOne = operandOne;
	}

	public double getOperandTwo() {
		return OperandTwo;
	}

	public void setOperandTwo(double operandTwo) {
		this.OperandTwo = operandTwo;
	}

	public String getOperation() {
		return Operation;
	}

	public void setOperation(String operation) throws Exception {
		if ((operation.equals("+"))||(operation.equals("-"))) {
			this.Operation = operation;
		} else {
			
		throw new Exception();
		}
	}
	
	public double performOperation() {
		double answer = 0;
		if (this.getOperation().equals("+")) {
			answer = this.getOperandOne()+this.getOperandTwo();
			return answer;
		}else if (this.getOperation().equals("-")) {
			answer = this.getOperandOne()-this.getOperandTwo();
			return answer;
		}else {
			return answer;
		}
	}
	
	public void getResults() {
		System.out.println(this.performOperation());
	}
	
}