package oefenopdracht4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import oefenopdracht4.View;
import oefenopdracht4.Model;

public class Controller extends JPanel {
	private static final long serialVersionUID = 1L;
	JButton button;
	private View view;
	private Model model;

	public Controller() {
		model = new Model();
		view = new View();
		this.add(view);
		button = view.Button();
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.Shuffle();
				view.setName(model.getName().toString());
			}
		});
		this.add(button);
	}
}
