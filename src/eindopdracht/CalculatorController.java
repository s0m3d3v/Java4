package eindopdracht;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//De controller coordineert interacties tussen de view en model
public class CalculatorController{

	private CalculatorView theView;
	private CalculatorModel theModel;

	public CalculatorController(CalculatorView theView, CalculatorModel theModel){

		this.theView = theView;
		this.theModel = theModel;

//		verteld de view wanneer de calculatebutton geklikt is het een actie moet uitvoeren

		this.theView.addCalculationListener(new CalculateListener());
	}

	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent actionEvent) {

			int firstNumber, secondNumber = 0;

//			de interactie met een try block gedaan voor als de nummers niet op goede wijze werden ingevoerd

			try {
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();

				theModel.addTwoNumbers(firstNumber, secondNumber);

				theView.setCalcSolution(theModel.getCalculationValue());

			}

			catch (NumberFormatException ex){
				theView.displayErrorMessage("You need two integers");
			}

		}
	}
}