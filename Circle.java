package lab;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Circle extends JPanel {

	
	
	
	

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//setBackground(Color.BLACK);
		g.setColor(Color.YELLOW);
		g.fillOval(50,50,20 ,20 );
	}
	
}
