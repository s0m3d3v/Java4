package eindopdracht;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Model {

	private Calculator calculator;
	private PropertyChangeSupport propertyChangeSupport;
	private double firstNumber;
	private double secondNumber;
	private char operator;
	private boolean answerIsGiven;
	private boolean operatorIsSelected;
	private boolean addSeparator;
	private boolean containsSeparator;

	public Model() {
		calculator = new Calculator();
		propertyChangeSupport = new PropertyChangeSupport(this);
		operatorIsSelected = false;
		containsSeparator = false;
		answerIsGiven = false;
		addSeparator = false;
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
		this.propertyChangeSupport.addPropertyChangeListener(listener);
	}

	public void setNumber(int number) { // store first and second number
		double tempNum;
		if (!operatorIsSelected) { // assign value to temporary number
			tempNum = firstNumber;
		} else {
			tempNum = secondNumber;
		}
		// if operator is selected, second number will be stored. Otherwise the first number
		double oldValue = tempNum;
		if (addSeparator) { // if setSeperator has been called
			tempNum= Double.parseDouble((int)tempNum+ "." + number);
			addSeparator = false;
			this.propertyChangeSupport.firePropertyChange("number", oldValue, tempNum);
		} else if (containsSeparator) { // if firstNumber contains a '.'
			tempNum= Double.parseDouble(tempNum+ "" + number);
			this.propertyChangeSupport.firePropertyChange("number", oldValue, tempNum);
		} else { // if firstNumber doesn't contain a '.'
			tempNum= Double.parseDouble((int)tempNum+ "" + number);
			this.propertyChangeSupport.firePropertyChange("number", oldValue, (int)tempNum);
		}
		if (!operatorIsSelected) { // give temporary value to first or second number
			firstNumber = tempNum;
		} else {
			secondNumber = tempNum;
		}
	}

	public void setSeparator() { // set the decimal point '.' and change values so setNumber knows decimal point is set
		containsSeparator = true;
		addSeparator = true;
	}

	public void setOperator(char operator) { // set operator and adjust variables so setNumber knows first number is set
		char oldValue = this.operator;
		this.operator = operator;
		this.propertyChangeSupport.firePropertyChange("operator", String.valueOf(oldValue), String.valueOf(this.operator));
		operatorIsSelected = true;
		containsSeparator = false;
		addSeparator = false;
	}

	public void setAnswer() { // calculate answer and reset variables to default value
		calculate(firstNumber, secondNumber, operator);
		firstNumber = 0;
		secondNumber = 0;
		operatorIsSelected = false;
		containsSeparator = false;
		addSeparator = false;
	}

	public void calculate(double first, double second, char operator) { // calculate answer and set new change
		double oldValue = calculator.getAnswer();
		switch (operator) {
			case '-':
				calculator.subtract(first, second);
				break;

			case '+':
				calculator.add(first, second);
				break;

			case 'x':
				calculator.multiply(first, second);
				break;

			case '/':
				calculator.divide(first, second);
				break;
		}
		if (calculator.getAnswer() % 1 == 0) { // remove decimals if not needed
			this.propertyChangeSupport.firePropertyChange("answer", oldValue, (int)calculator.getAnswer());
		} else { // keep decimals
			this.propertyChangeSupport.firePropertyChange("answer", oldValue, calculator.getAnswer());
		}
	}

	public double getFirstNumber() {
		return firstNumber;
	}

	public double getSecondNumber() {
		return secondNumber;
	}

	public char getOperator() {
		return operator;
	}

	public double getAnswer() {
		return calculator.getAnswer();
	}
}