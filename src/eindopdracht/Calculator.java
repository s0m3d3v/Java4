package eindopdracht;

public class Calculator {

	private double answer;

	public void add(double first, double second) { // add two numbers
		answer = first + second;
	}

	public void subtract(double first, double second) { // subtract two numbers
		answer = first - second;
	}

	public void multiply(double first, double second) { // multiply two numbers
		answer = first * second;
	}

	public void divide(double first, double second) { // divide two numbers
		answer = first / second;
	}

	public double getAnswer() { // return answer
		return answer;
	}
}