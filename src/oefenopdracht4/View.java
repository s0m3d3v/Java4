package oefenopdracht4;

import javax.swing.*;

public class View extends JPanel {
	private static final long serialVersionUID = 1L;
	private JLabel display;
	private JButton button;
	
	
	public JButton Button() {
		button = new JButton("Genereer een willekeurige naam");
		this.add(button);
		return button;
	}
	public View() {
		display = new JLabel("text");
		this.add(display);
	}

	public void setName(String text) {
		display.setText(text);
	}
}