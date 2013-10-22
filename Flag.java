import java.awt.*;
import java.applet.*;

public class Flag extends Applet {
	
	private AmericanFlag flag;

	public void init() {
		flag = new AmericanFlag(50, 50, 1.0);
	}

	public void paint(Grapics g) {
		flag.draw(g);
	}

}