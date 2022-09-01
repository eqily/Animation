import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class DrawingCanvas extends JComponent{
	private AnimatedObject pic;
	private Image scaledImage;
	private int width;
	private int height;

	public DrawingCanvas(int width, int height){
		this.width = width;
		this.height = height;
		this.setPreferredSize(new Dimension(width, height));
		//DON'T edit above this


		//You need to constructor your AnimatedObject here. Change this code to match your constructor. This is the ONLY line you may change in this file.
		this.pic = new AnimatedObject(69, 42, 100, 100, 5, "awk python turtle.png");
	

		//DON'T edit below this

		//this scales the image to whatever size you set in the constructor on the line above
		this.scaledImage = new ImageIcon(pic.getPic()).getImage().getScaledInstance(pic.getWidth(), pic.getHeight(),Image.SCALE_SMOOTH);
		

		DrawingCanvas canvas = this;
		class TimerListener implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				pic.update();
				canvas.repaint();
			}
		}
		Timer t = new Timer(100, new TimerListener());
		t.start();
	}

	public void paintComponent(Graphics gr){
		Graphics2D g = (Graphics2D) gr;
    AffineTransform backup = g.getTransform();
    
		//This code rotates the drawing canvas, draws the image, and rotates the canvas back to normal.
		AffineTransform a = AffineTransform.getRotateInstance(Math.toRadians(pic.getTheta()), pic.getX() + pic.getWidth()/2, pic.getY() + pic.getHeight()/2);
    g.setTransform(a);
		g.drawImage(this.scaledImage, pic.getX(), pic.getY(), this);
    g.setTransform(backup);

	}

}
