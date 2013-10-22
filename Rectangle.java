public class Rectangle {
	private int width;
	private int height;
	private Color color;
	public Rectangle(int width, int height, Color color) {
		this.width = width;
		this.height = height;
		this.color = color;

	}

	public paint(Graphics g) {
		g.fillRect(0, 0, width, height);
	}
}