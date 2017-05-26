import java.awt.Graphics;

public class Graphic {

	public Graphic(Frame a)
	{
		Graphics g = a.getGraphics();
		g.drawString("WOrk", 100, 100);
	}
}
