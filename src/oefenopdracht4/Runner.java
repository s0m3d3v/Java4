package oefenopdracht4;

import java.awt.FlowLayout;
import javax.swing.JFrame;

public class Runner {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Eindopdracht 4");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLayout(new FlowLayout());
		frame.add(new Controller());
	}
}
