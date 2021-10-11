package lab;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JPanel;

public class square extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//setBackground(Color.BLACK);
		g.setColor(Color.PINK);
		g.fillOval(50,50,20 ,20 );
	}
}
