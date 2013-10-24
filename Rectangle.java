import java.awt.Graphics;
import java.awt.Color;
public class Rectangle {
	private int width;
	private int height;
	private Color color;
	public Rectangle(int width, int height, Color color) {
		this.width = width;
		this.height = height;
		this.color = color;

	}

	public void paint(Graphics g, int x, int y) {
		g.setColor(this.color);
		g.fillRect(x, y, width, height);
	}
}