import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Graphic implements KeyListener{
	public 	Graphics g; 
	public Graphic(Frame a)
	{
		g = a.getGraphics();
		g.setFont(new Font("Century Gothic", Font.PLAIN, 30));
		g.setColor(Color.WHITE);
		g.drawString("Hypnogogia", 450, 100);
		a.addKeyListener(this);
		//drawRect1();
	}
	public void drawRect1()
	{
		g.drawRect(100, 100, 100, 100);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == 32)
		{
			g.drawString("You have pressed space", 500, 500);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == 32)
		{
			g.drawString("You have released space", 500, 600);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		

	


	}
}
