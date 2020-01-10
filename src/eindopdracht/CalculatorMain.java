package eindopdracht;

public class CalculatorMain {

	public static void main(String[] args)
	{
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();

		new CalculatorController(model,view);
	}

}