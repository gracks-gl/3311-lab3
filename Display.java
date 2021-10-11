package lab;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class  Display extends JPanel {

	
	public Display() {
		setLayout(null);
		
		JButton ls = new JButton("Load Shapes");
		JButton s = new JButton("Sort Shapes");
		
		ls.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for(int i =0; i<2; i++) {
       add(new Circle());	
       add(new rect());
       add(new square());
       repaint();
       i++;
			}

			}
			
		});
		ls.setBounds(400,100,120,30);
		s.setBounds(300,100,120,30);
		add(ls);
		add(s);

	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.WHITE);
		g.setColor(Color.RED);
		g.fillRect(0, 0 ,100, 100);
	
	}
	
	

	
}
