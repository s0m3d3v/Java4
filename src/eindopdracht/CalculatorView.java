package eindopdracht;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;

public class CalculatorView
{
	JButton oneBtn, twoBtn, threeBtn, fourBtn, fiveBtn;
	JButton sixBtn,sevenBtn, eightBtn, nineBtn, zeroBtn;
	JButton addBtn, subtractBtn, multiplyBtn, divideBtn;
	JButton resetBtn, equalsBtn;

	JTextField textFeild;

	JFrame frame;

	JPanel numbersPanel, signsPanel;

	CalculatorView()
	{
		frame = new JFrame("Simple Calculator");
		frame.setSize(300,300);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		textFeild = new JTextField(10);

		JPanel numbersPanel = new JPanel();
		JPanel signsPanel = new JPanel();

		numbersPanel = numberPan(numbersPanel);
		signsPanel = signPan(signsPanel);

		frame.add(textFeild,BorderLayout.PAGE_START);
		frame.add(numbersPanel,BorderLayout.CENTER);
		frame.add(signsPanel,BorderLayout.LINE_END);

		frame.setResizable(false);
		frame.setVisible(true);
	}

	//returns a matrix of buttons to represent the numbers
	//on the calculator
	JPanel numberPan(JPanel panel)
	{
		oneBtn = new JButton("1");
		twoBtn = new JButton("2");
		threeBtn = new JButton("3");
		fourBtn= new JButton("4");
		fiveBtn= new JButton("5");
		sixBtn= new JButton("6");
		sevenBtn= new JButton("7");
		eightBtn= new JButton("8");
		nineBtn= new JButton("9");
		zeroBtn= new JButton("0");

		panel.add(sevenBtn);
		panel.add(eightBtn);
		panel.add(nineBtn);
		panel.add(fourBtn);
		panel.add(fiveBtn);
		panel.add(sixBtn);
		panel.add(oneBtn);
		panel.add(twoBtn);
		panel.add(threeBtn);
		panel.add(zeroBtn);

		panel.setLayout(new GridLayout(3,4));

		return panel;
	}

	//return a horizontal pattern of buttons to represent
	//the mathematical signs of the calculator
	JPanel signPan(JPanel panel)
	{
		addBtn= new JButton("+");
		addBtn.setPreferredSize(new Dimension(10,10));
		subtractBtn= new JButton("-");
		multiplyBtn= new JButton("*");
		divideBtn= new JButton("/");

		resetBtn= new JButton("C");
		equalsBtn= new JButton("=");

		panel.add(resetBtn);
		panel.add(addBtn);
		panel.add(subtractBtn);
		panel.add(multiplyBtn);
		panel.add(divideBtn);
		panel.add(equalsBtn);

		panel.setLayout(new GridLayout(3,3));

		return panel;
	}

	void setTextValue(int value)
	{
		//sets textField to String value
		textFeild.setText(Integer.toString(value));
	}

	//returns number currently in TextBox
	int getTextFeildValue()
	{
		int value = Integer.parseInt(textFeild.getText());

		return value;
	}



}
