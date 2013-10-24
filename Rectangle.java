import java.awt.Graphics;
import java.awt.Color;

public class Rectangle {
	private int width;
	private int height;
	private Color color;
	private Point point;
	public Rectangle(int width, int height, Color color, Point point) {
		this.width = width;
		this.height = height;
		this.color = color;
		this.point = point;
		
		

	}

	public void paint(Graphics g) {
		g.setColor(this.color);
		g.fillRect(this.point.getX(), this.point.getY(), width, height);
	}
}