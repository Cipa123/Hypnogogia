import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class MainGame extends Canvas implements Runnable {
	
	
	public static final int WIDTH = 160;
	public static final int HEIGHT = WIDTH/12*9;
	public static final int SCALE = 3;
	public static final String NAME = "Hypnogogia";
	
	
	private JFrame frame;
	
	public boolean running;
	
	
	public MainGame() {
		
		setMinimumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		setMaximumSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		setPreferredSize(new Dimension(WIDTH*SCALE, HEIGHT*SCALE));
		
		frame = new JFrame(NAME); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(this, BorderLayout.CENTER);
		frame.pack();
		
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
	
	
	private synchronized void start() {
		running = true;
		new Thread(this).start();	
	}
	
	
	private synchronized void stop() {
		running = false;
		
	}
	

	@Override
	public void run() {
		
		long TargetTime = System.nanoTime();
		double nsPerTick = 1000000000D/60D;
		
		int ticks = 0;
		int frames = 0;
		
		long lastTimer = System.currentTimeMillis();
		double delta = 0;
		
		while(running){
			long now = System.nanoTime();
			delta += (now - TargetTime) / nsPerTick;
			TargetTime = now;
			
			while (delta >= 1){
				ticks++;	
				tick();
				delta -= 1;
			}
			
			frames++;
			render();
			
			if(System.currentTimeMillis() - lastTimer >= 1000){
				
				
				
				
			}
		
			
			
			
		}
		
		
	}
	public void tick(){
		
	}
	
	public void render(){
		
	}
	public static void main (String[] args) {
		
		new MainGame().start();
		
		
	}


	
	
	

}
