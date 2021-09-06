package BroCode;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class JFrame_Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("BEST PROGRAM IN THE WORLD!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(600,500);
		frame.setResizable(true); //This is unnecessary unless you put "false" lol
		frame.getContentPane().setBackground(new Color(100,255,255));
		
		
		//The image icon doesn't work for some reason :(
		ImageIcon image = new ImageIcon("dog2.jpg");
		frame.setIconImage(image.getImage());

	}

}
