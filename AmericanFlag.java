import java.awt.Color;
import java.awt.Graphics;

public class AmericanFlag {
	
	private int length;
	private int width;
	private double scale;
	private Rectangle red;
	private Rectangle white;
	private Rectangle blue;
	private Rectangle[] stripes;

	public AmericanFlag(int length, int width, double scale){
		this.length = length;
		this.width = width;
		this.scale = scale;
		this.stripes = new Rectangle[13];

		
	}

	public void draw(Graphics g) {
		this.red = new Rectangle(length, 40, Color.red, new Point(0,0));
		this.white = new Rectangle(length, 40, Color.white, new Point(0,0));
		this.blue = new Rectangle(200, 200, Color.blue, new Point(0,0));

		for (int i=1; i<=stripes.length; i++) {
			if (i%2==0) {
				this.white.paint(g);
				Point.setY(i*40);
			} else {
				this.red.paint(g);
				Point.setY(i*40);
			}
		}
		// red.paint(g, 0, 0);
		// white.paint(g, 0, 40);
		// red.paint(g, 0, 80);
		// white.paint(g, 0, 120);
		// red.paint(g, 0, 160);
		// white.paint(g, 0, 200);
		// red.paint(g, 0, 240);
		// white.paint(g, 0, 280);
		// red.paint(g, 0, 320);
		// white.paint(g, 0, 360);
		// red.paint(g, 0, 400);
		// white.paint(g, 0, 440);
		// red.paint(g, 0, 480);
		// blue.paint(g, 0, 0);
	}
	
}