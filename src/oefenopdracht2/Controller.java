package oefenopdracht2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.*;

public class Controller extends JPanel implements Observer {
	JButton clickButton;
	private View view;
	private final Model model;

	public Controller() {
		model = new Model();
		model.addObserver(this);
		view = new View();
		this.add(view);
		clickButton = new JButton("+1");
		clickButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.increase();
//view.Display(model.getCounter().toString()); // verwijderd
			}
		});
		this.add(clickButton);
	}

	@Override
	public void update(Observable o, Object arg) {
		view.setDisplay(model.getCounter().toString());
	}
}