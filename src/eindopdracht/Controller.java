package eindopdracht;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Controller extends VBox implements PropertyChangeListener {

	private Model model;
	private View view;
	HBox firstRow;
	HBox secondRow;
	HBox thirdRow;
	HBox fourthRow;

	public Controller() {
		model = new Model();
		model.addPropertyChangeListener(this);
		view = new View();
		this.getChildren().add(view);
		initRows();
		initNumberButtons();
		initOtherButtons();
		initOperatorButtons();
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		view.setText(evt.getNewValue().toString());
	}

	private void initRows() { // create and add new rows to controller
		this.getChildren().add(firstRow = new HBox());
		this.getChildren().add(secondRow = new HBox());
		this.getChildren().add(thirdRow = new HBox());
		this.getChildren().add(fourthRow = new HBox());
	}

	private void initNumberButtons() { // init number buttons
		HBox[] rows = {firstRow, secondRow, thirdRow, fourthRow};
		String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
		int index = 0;
		for (int x = 0; x < 4; x++) { // loop through rows
			for (int y = 0; y < 3; y++) { // loop through numbers
				if (index < 10) { // prevent indexOutOfBoundsExceptions
					// set name, dimensions and actionevent of number buttons
					Button button = new Button(numbers[index]);
					button.setPrefWidth(75);
					button.setPrefHeight(75);
					int finalIndex = index;
					button.setOnAction(event ->
							model.setNumber(Integer.parseInt(numbers[finalIndex]))
					);
					rows[x].getChildren().add(button);
					index++;
				}
			}
		}
	}

	private void initOperatorButtons() { // init +, -, x and / buttons
		char[] operators = {'/', 'x', '-', '+'};
		HBox[] rows = {firstRow, secondRow, thirdRow, fourthRow};
		for (int x = 0; x < 4; x++) { // set name, dimensions and actionevent
			Button button = new Button(String.valueOf(operators[x]));
			button.setPrefWidth(75);
			button.setPrefHeight(75);
			int finalX = x;
			button.setOnAction(event ->
					model.setOperator(operators[finalX])
			);
			rows[x].getChildren().add(button);
		}
	}

	private void initOtherButtons() { // init . and = buttons
		// set name, dimensions and actionevent
		Button button = new Button(String.valueOf('.'));
		button.setPrefWidth(75);
		button.setPrefHeight(75);
		button.setOnAction(event -> {
			model.setSeparator();
		});
		fourthRow.getChildren().add(button);

		// set name, dimensions and actionevent of
		button = new Button(String.valueOf('='));
		button.setPrefWidth(75);
		button.setPrefHeight(75);
		button.setOnAction(event -> {
			model.setAnswer();
		});
		fourthRow.getChildren().add(button);
	}
}