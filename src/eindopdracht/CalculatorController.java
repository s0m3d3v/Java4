package eindopdracht;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController
{
	CalculatorModel model;
	CalculatorView view;

	CalculatorController(CalculatorModel model,CalculatorView view) {
		this.model = model;
		this.view = view;

		//setting action listeners for each button in the view class
		view.addBtn.addActionListener(new Actions());
		view.subtractBtn.addActionListener(new Actions());
		view.multiplyBtn.addActionListener(new Actions());
		view.divideBtn.addActionListener(new Actions());
		view.equalsBtn.addActionListener(new Actions());
		view.resetBtn.addActionListener(new Actions());
		view.oneBtn.addActionListener(new Actions());
		view.twoBtn.addActionListener(new Actions());
		view.threeBtn.addActionListener(new Actions());
		view.fourBtn.addActionListener(new Actions());
		view.fiveBtn.addActionListener(new Actions());
		view.sixBtn.addActionListener(new Actions());
		view.sevenBtn.addActionListener(new Actions());
		view.eightBtn.addActionListener(new Actions());
		view.nineBtn.addActionListener(new Actions());
		view.zeroBtn.addActionListener(new Actions());
	}

	//inner class that will handle action listeners
	class Actions implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			try{

				if(e.getSource() == view.addBtn) {
					//sends button and textField to model class
					//to handle calculations
					model.set(view.addBtn, view.textFeild);

					//sets JTextFeild the sum from model.set
					view.setTextValue(model.getSum());
				}
				else if(e.getSource() == view.subtractBtn) {
					model.set(view.subtractBtn, view.textFeild);

					view.setTextValue(model.getSum());
				}
				else if(e.getSource() == view.divideBtn) {
					model.set(view.divideBtn, view.textFeild);

					view.setTextValue(model.getSum());
				}
				else if(e.getSource() == view.multiplyBtn) {
					model.set(view.multiplyBtn, view.textFeild);

					view.setTextValue(model.getSum());
				}
				else if(e.getSource() == view.equalsBtn) {
					model.set(view.equalsBtn, view.textFeild);

					view.setTextValue(model.getSum());
				}
				else if(e.getSource() == view.resetBtn) {
					model.set(view.resetBtn, view.textFeild);

					view.setTextValue(model.getSum());
				}
				//now handing number buttons
				else if(e.getSource() == view.oneBtn) {
					model.setNumber(1);
					view.setTextValue(1);
				}
				else if(e.getSource() == view.twoBtn) {
					model.setNumber(2);
					view.setTextValue(2);
				}
				else if(e.getSource() == view.threeBtn) {
					model.setNumber(3);
					view.setTextValue(3);
				}
				else if(e.getSource() == view.fourBtn) {
					model.setNumber(4);
					view.setTextValue(4);
				}
				else if(e.getSource() == view.fiveBtn) {
					model.setNumber(5);
					view.setTextValue(5);
				}
				else if(e.getSource() == view.sixBtn) {
					model.setNumber(6);
					view.setTextValue(6);
				}
				else if(e.getSource() == view.sevenBtn) {
					model.setNumber(7);
					view.setTextValue(7);
				}
				else if(e.getSource() == view.eightBtn) {
					model.setNumber(8);
					view.setTextValue(8);
				}
				else if(e.getSource() == view.nineBtn) {
					model.setNumber(9);
					view.setTextValue(9);
				}
			}catch(Exception ex) {
				System.out.println("There was an ERROR! "+ex);
			}
		}
	}
}
