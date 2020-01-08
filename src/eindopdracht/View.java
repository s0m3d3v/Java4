package eindopdracht;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class View extends HBox {

	private Label resultLabel;

	public View() {
		initResultLabel();
	}

	private void initResultLabel() { // initialize result label
		resultLabel = new Label();
		resultLabel.setText("");
		resultLabel.setAlignment(Pos.CENTER);
		resultLabel.setPrefWidth(300);
		resultLabel.setPrefHeight(75);
		resultLabel.setFont(Font.font ("Consolas", FontWeight.BOLD, 30));
		resultLabel.setStyle("-fx-background-color:#e0e0e0");
		this.setAlignment(Pos.CENTER);
		this.getChildren().add(resultLabel);
	}

	public void setText(String text) { // set text to label
		resultLabel.setText(text);
	}
}
