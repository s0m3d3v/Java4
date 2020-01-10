package eindopdracht;

import javax.swing.*;

public class CalculatorModel
{
	private int sum;
	private int number;
	private char opt;

	public CalculatorModel()
	{
		sum = 0;
		number = 0;
	}

	public void set(JButton idenifier, JTextField number)
	{
		//this will receive '+' '-' '/' '*' etc
		opt = idenifier.getText().charAt(0);

		//getting value from JTextField and setting it as a integer
		this.number = Integer.parseInt(number.getText());

		//for testing
		System.out.println("The char is: "+opt+" and the int is: "+this.number);

		calculate(opt);
	}

	public void setNumber(int number)
	{
		this.number = number;
	}

	public int getSum() {
		return sum;
	}

	private void setSum(int sum)
	{
		this.sum = sum;
	}

	void calculate(char sign)
	{
		switch(sign)
		{
			case '+':
				sum += number;
				setSum(sum);
				System.out.println("The sum is "+getSum()+" the number is "+number);
				break;

			case '-':
				sum -= number;
				setSum(sum);
				System.out.println("The sum is "+getSum()+" the number is "+number);
				break;

			case '/':
				sum/= number;
				setSum(sum);
				System.out.println("The sum is "+getSum()+" the number is "+number);
				break;

			case 'X':
				sum *= number;
				setSum(sum);
				System.out.println("The sum is "+getSum()+" the number is "+number);
				break;

			case '=':
				number=getSum();
				System.out.println("The sum is "+getSum());
				break;

			case 'C':
				opt = 0;
				number = 0;
				sum = 0;
				setSum(sum);
				break;
			default:
		}
	}
}