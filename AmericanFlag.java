import java.awt.Color;
import java.awt.Graphics;

public class AmericanFlag {
	
	private int length;
	private int width;
	private double scale;

	public AmericanFlag(int length, int width, double scale){
		this.length = length;
		this.width = width;
		this.scale = scale;

		
	}

	public void draw(Graphics g) {
		Rectangle red = new Rectangle(1250, 40, Color.red);
		Rectangle white = new Rectangle(1250, 40, Color.white);
		Rectangle blue = new Rectangle(200, 200, Color.blue);
		red.paint(g, 0, 0);
		white.paint(g, 0, 40);
		red.paint(g, 0, 80);
		white.paint(g, 0, 120);
		red.paint(g, 0, 160);
		white.paint(g, 0, 200);
		red.paint(g, 0, 240);
		white.paint(g, 0, 280);
		red.paint(g, 0, 320);
		white.paint(g, 0, 360);
		red.paint(g, 0, 400);
		white.paint(g, 0, 440);
		red.paint(g, 0, 480);
		blue.paint(g, 0, 0);
	}
	
}