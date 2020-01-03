package oefenopdracht1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Controller extends JPanel {
	JButton clickButton;
	private View view;
	private Model model;

	public Controller() {
		model = new Model();
		view = new View();
		this.add(view);
		clickButton = new JButton("+1");
		clickButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.increase();
				view.setDisplay(model.getCounter().toString());
			}
		});
		this.add(clickButton);
	}
}
