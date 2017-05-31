
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

import org.omg.CORBA.INTERNAL;

public class Animations extends Thread{
	private int delay;
	private JFrame frame;
	private Graphics g;
	private boolean run = true;
	public Animations(JFrame f)
	{
		delay = 0;
		frame = f;
		g = f.getGraphics();
	}
	public void run()
	{
		
			g.setFont(new Font("Century Gothic", Font.ITALIC, 20));
		
			while(run)
			{
				for(int i = 440; i<601 ; i= i+1)
					{
						g.setColor(Color.RED);
						g.drawLine(i ,200, i+1 , 200);
							try
							{
								sleep(10);
							}
							catch(InterruptedException e)
							{
								
							}
					}
				for(int i = 440; i<601 ; i= i+1)
				{
					g.setColor(Color.BLACK);
					g.drawLine(i ,200, i+1 , 200);
						try
						{
							sleep(10);
						}
						catch(InterruptedException e)
						{
							
						}
				}
					
				
			}
		}
	
 public void setFalse()
 {
	 run = false;
 }
	
}
