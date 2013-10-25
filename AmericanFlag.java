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
	private Point point;


	public AmericanFlag(int length, int width, double scale){
		this.length = length;
		this.width = width;
		this.scale = scale;
		this.stripes = new Rectangle[13];

		
	}

	public void draw(Graphics g) {
		int y = 0;
		double newLength = width*.76;

		this.blue = new Rectangle((int)newLength, (int)width*7/13, Color.blue, new Point(0,0));
		this.point = new Point(0,0);
		System.out.println(newLength);

		for (int i=1; i<=stripes.length; i++) {
			if (i%2==0) {
				this.white = new Rectangle(length, (int)width/13, Color.white, new Point(0,y));
				stripes[i-1] = this.white;
				y += width/13;
			} else {
				this.red = new Rectangle(length, (int)width/13, Color.red, new Point(0,y));
				stripes[i-1] = this.red;
				y += width/13;
			}
		}

		for (int i = 0; i<stripes.length; i++) {
			stripes[i].paint(g);
		}

		this.blue.paint(g);
	}
	
}