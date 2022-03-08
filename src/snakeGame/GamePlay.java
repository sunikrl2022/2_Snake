package snakeGame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

public class GamePlay extends JPanel {
	
	public GamePlay() {
		
	}
	public void paint(Graphics g) {
		
//		//border of title image
//		g.setColor(Color.WHITE);
////		g.drawRect(24, 10, 851, 55);
//////		JPanel pane = new JPanel();
//////		pane.setBorder(BorderFactory.createLineBorder(Color.WHITE));
////		//JButton b1 = new JButton("NORTH");
////		//b1.add(b1, BorderLayout.NORTH);
////		
////		
////		
////		//border of image
////		g.setColor(Color.WHITE);
////		g.drawRect(24,74 ,851 ,55);
////		g.setColor(Color.BLACK);
////		g.fillRect(25, 75, 850, 575);
//		
		//border of title image
				g.setColor(Color.white);
				g.drawRect(24,10,851,55);
				
//				titleImage = new ImageIcon("snaketitle.jpg");
//				titleImage.paintIcon(this, g, 25, 11);
				
				//border of gameplay
				g.setColor(Color.white);
				g.drawRect(24,74,851,577);
				g.setColor(Color.BLACK);
				g.fillRect(25, 75, 850, 575);
				
				//draw the scores
				g.setColor(Color.WHITE);
				g.setFont(new Font("arial",Font.PLAIN,14));
				//g.drawString("Scores : "+scores,780, 30);
	}

}
