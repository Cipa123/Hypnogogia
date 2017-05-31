import java.awt.Color;


public class Main {
	public static Graphic g;
	@SuppressWarnings("deprecation")
	public static void main(String [] args)
	{
		Frame frame = new Frame();
		frame.setVisible(true);
		 g = new Graphic(frame);
		 Thread animate = new Animations(frame);
		 animate.start();
		 		 while(frame.stopThread() < 1)
		 {
			 System.out.print(""+frame.stopThread());
		 }
		 animate.stop();
		
	
		
	}


}
