//dit is de view, de enige taak van de view is om te zetten op display wat de gebruiker moet zien
//er kan informatie in worden ingevoerd

package eindopdracht;

import java.awt.event.ActionListener;
import javax.swing.*;

public class CalculatorView extends JFrame{

	private JTextField firstNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);

	CalculatorView(){

//		zet de view op en voegt de components toe

		JPanel calcPanel = new JPanel();

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);

		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);

		this.add(calcPanel);

//		einde van components opzetten
	}

	public int getFirstNumber() {

		return Integer.parseInt(firstNumber.getText());
	}

	public int getSecondNumber() {

		return Integer.parseInt(secondNumber.getText());
	}

	public int getCalcSolution(){

		return Integer.parseInt(calcSolution.getText());
	}

	public void setCalcSolution(int solution){

		calcSolution.setText(Integer.toString(solution));
	}

//	als de calculatebutton is geklikt voert het een ActionPerformed uit in de controller
	void addCalculationListener(ActionListener listenerForCalcButton){

		calculateButton.addActionListener(listenerForCalcButton);

	}

//	opent een popu met een error als de gebruiker niet op juiste wijze dit heeft ingevoerd.
	void displayErrorMessage(String errorMessage){

		JOptionPane.showMessageDialog(this, errorMessage);
	}
}