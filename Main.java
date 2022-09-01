

//DON'T EDIT ME!!!!

import javax.swing.*;
import java.awt.*;

public class Main{
	public static void main(String[] args){
		JFrame frame=new JFrame("you spin me round");
		DrawingCanvas dc = new DrawingCanvas(798,570);
		frame.add(dc);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
 