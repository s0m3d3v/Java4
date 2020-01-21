package eindopdracht;

public class CalculatorMain {

	public static void main(String[] args) {
		CalculatorModel theModel = new CalculatorModel();
		CalculatorView theView = new CalculatorView();

		CalculatorController theController = new CalculatorController(theView, theModel);

		theView.setVisible(true);
	}
}