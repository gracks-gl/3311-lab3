package lab;

import java.awt.*;

import javax.swing.*;

public class Main {
	
	private static final int HEIGHT = 600;
	private static final int  WIDTH = 600;

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Display Shapes");
		frame.setSize(600,600);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(new Display());
		frame.setVisible(true);
	}

}
