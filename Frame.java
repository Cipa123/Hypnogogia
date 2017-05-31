import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame  extends JFrame {
	private JPanel helpPanel ,master, centerPanel, questionPanel, questionPanel1, questionPanel2, questionPanel3;
	private JButton help, start;
	private int stopThread = 0;
	
		public Frame()
		{
			super("Hypnogogia");
			master = new JPanel();
			setSize(1024,720);
			setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			master.setBackground(Color.BLACK);
			master.setLayout(new BorderLayout());
			
			helpPanel = new JPanel();
			helpPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
			helpPanel.setBackground(Color.BLACK);
			help = new JButton("HELP");
			help.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					JFrame helpFrame = new JFrame("HELP");
					helpFrame.setSize(612, 460);
					helpFrame.setVisible(true);
					helpFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					JPanel helpFramePanel =  new JPanel();
					JLabel helpFrameLabel = new JLabel();
					helpFrameLabel.setText("<html>Story<br>You have a special ability. This ability is to interact with the real world through your "
							+ "<br>dreams. The laboratory holds you hostage as they conduct many tests on you against your "
							+ "<br>will.  The scientists are trying to harness your power and turn you into a telepathic or "
							+ "<br> telekinetic weapon. To do this, they have to induce you into sleep and force you to bring "
							+ "<br> back horrible memories from your childhood. Since you can interact with the real world, your "
							+ "<br> dreams do affect your physical health. You need to escape the lab before your ability falls "
							+ "<br> into the wrong hands and you become submissive to insanity and self-deprecation."
							+ "<br><br> There are 3 statistics that you should be aware of in the game"
							+ "<br> <br> Lucidity = The strength of your ability to control the parts of your dream, also is factor in how "
							+ "<br> well you can interact with the outside world."
							+ "<br><br> Panic = Your insanity in your dream state, if you lose the fundamentals and characteristics "
							+ "<br> that make you, it may take a toll on your physical body."
							+ "<br><br> Excitement = Your ability to retain the dream. If you do not remain calm you can lose sight of "
							+ "<br> your dream and wake up.</html>"
						);
					helpFramePanel.setBackground(Color.WHITE);
					helpFramePanel.add(helpFrameLabel);
					helpFrame.add(helpFramePanel);

				}
			});
			helpPanel.add(help);
			
			master.add(helpPanel, BorderLayout.NORTH);
			
			centerPanel = new JPanel();
			centerPanel.setLayout(new GridLayout(2, 1));
			centerPanel.setBackground(Color.BLACK);
			
		    JPanel	startButtonPanel = new JPanel();
		    startButtonPanel.setBackground(Color.BLACK);
			start = new JButton("Start");
			
			start.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					questions();
				}
				
			});
			
			startButtonPanel.add(start);
			
			JPanel fillerNorth = new JPanel();
			fillerNorth.setBackground(Color.BLACK);
			
			centerPanel.add(fillerNorth);
			centerPanel.add(startButtonPanel);
			
			
			master.add(centerPanel, BorderLayout.CENTER);
			
			add(master);
		
			setResizable(false);
		
		}

		public void questions()
		{
			stopThread = 2;
			remove(master);
			revalidate();
			repaint();
			
			questionPanel = new JPanel();
			
			JPanel questionLabels = new JPanel();
			
			questionPanel.setLayout(new BorderLayout());
			
			questionLabels.setBackground(Color.black);
			questionPanel.setBackground(Color.black);
			
			
			JPanel go = new JPanel();
			JButton clickGo = new JButton("Continue");
			clickGo.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					//end();
					//paintTest2();
					
					QuestionScreen1();
				}
			});
			go.add(clickGo);
			
			JLabel choosen = new JLabel("");
			
			JLabel label = new JLabel("<html><h1>------------------------------------------------------<br>" +
	 				"Welcome to the Labratory of Hypnogogia!<br>" +
	 				"------------------------------------------------------<br>" +
	 				"I will need to ask you some questions before we begin our procedure<br>"+
	 				"You are cooking with your parents and a hot pipe breaks from the wall and swings into the direction of your mom.<br>"+
	 				"What do you do?<br>"+
	 				"------------------------------------------------------<br>"+
	 				"1 = Step in front of your mom and the hot pipe<br>"+
	 				"2 = Push your mom out of the way<br>"+
	 				"3 = Do Nothing<br>"+
	 				"------------------------------------------------------<br></h1></html> ");
			label.setForeground(Color.white);
			Font font = new Font("Helvetica", Font.PLAIN, 18);
			label.setFont(font);
		
		    ImageIcon	image1 = new ImageIcon(getClass().getResource("Button 1.png"));
			JButton jb1 = new JButton(image1);
			jb1.setContentAreaFilled(false);
				//jb1.setBorderPainted(false);
			jb1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					clickGo.setText("You have choosen one");
				}
			});
			
			ImageIcon image2 = new ImageIcon(getClass().getResource("Button 2.png"));
			JButton jb2 = new JButton(image2);
			jb2.setContentAreaFilled(false);
			jb2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					clickGo.setText("You have choosen two");
				}
			});
			
			ImageIcon image3 = new ImageIcon(getClass().getResource("Button 3.png"));
			JButton jb3 = new JButton(image3);
			jb3.setContentAreaFilled(false);	
			jb3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					clickGo.setText("You have choosen three");
				}
			});
			
			
		
			questionLabels.add(choosen);
			questionLabels.add(jb1);
			questionLabels.add(jb2);
			questionLabels.add(jb3);
			//labels.add(choosen);
		
			questionPanel.add(label ,BorderLayout.NORTH);
			questionPanel.add(questionLabels, BorderLayout.CENTER);
			questionPanel.add(go, BorderLayout.SOUTH);
		
			add(questionPanel);
			repaint();
			revalidate();
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		public void QuestionScreen1()
		{
			remove(questionPanel);
			questionPanel1 = new JPanel();
			
			JPanel questionLabels = new JPanel();
			
			questionPanel1.setLayout(new BorderLayout());
			
			questionLabels.setBackground(Color.black);
			questionPanel1.setBackground(Color.black);
			
			
			JPanel go = new JPanel();
			final JButton clickGo = new JButton("Continue");
			clickGo.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					QuestionScreen2();
				
				}
			});
			go.add(clickGo);
			
			JLabel choosen = new JLabel("");
			
			JLabel label = new JLabel("<html><h1>------------------------------------------------------<br>" +
	 				"Onto next question...<br>" +
	 				"------------------------------------------------------<br>" +
	 				"You are in the classroom and the kid next to you spills drink all over you. You don't know if he did it on purpose or on accident.<br>"+
	 				"He says he is terribly sorry. What do you do?<br>"+
	 				"------------------------------------------------------<br>"+
	 				"1 = Forgive him and continue class in soaking clothes<br>"+
	 				"2 = Leave to go to bathroom to change clothes<br>"+
	 				"3 = Punch the kid in the face<br>"+
	 				"------------------------------------------------------<br></h1></html>");
			label.setForeground(Color.white);
			Font font = new Font("Helvetica", Font.PLAIN, 18);
			label.setFont(font);
		
		    ImageIcon	image1 = new ImageIcon(getClass().getResource("Button 1.png"));
			JButton jb1 = new JButton(image1);
			jb1.setContentAreaFilled(false);
				//jb1.setBorderPainted(false);
			jb1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					clickGo.setText("You have choosen one");
				}
			});
			
			ImageIcon image2 = new ImageIcon(getClass().getResource("Button 2.png"));
			JButton jb2 = new JButton(image2);
			jb2.setContentAreaFilled(false);
			jb2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					clickGo.setText("You have choosen two");
				}
			});
			
			ImageIcon image3 = new ImageIcon(getClass().getResource("Button 3.png"));
			JButton jb3 = new JButton(image3);
			jb3.setContentAreaFilled(false);	
			jb3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					clickGo.setText("You have choosen three");
				}
			});
			
			
		
			questionLabels.add(choosen);
			questionLabels.add(jb1);
			questionLabels.add(jb2);
			questionLabels.add(jb3);
			//labels.add(choosen);
		
			questionPanel1.add(label ,BorderLayout.NORTH);
			questionPanel1.add(questionLabels, BorderLayout.CENTER);
			questionPanel1.add(go, BorderLayout.SOUTH);
		
			add(questionPanel1);
			repaint();
			revalidate();
			
		}
		public void QuestionScreen2()
		{
		remove(questionPanel1);
			questionPanel2 = new JPanel();
			
			JPanel questionLabels = new JPanel();
			
			questionPanel2.setLayout(new BorderLayout());
			
			questionLabels.setBackground(Color.black);
			questionPanel2.setBackground(Color.black);
			
			
			JPanel go = new JPanel();
			final JButton clickGo = new JButton("Continue");
			clickGo.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					QuestionScreen3();
				}
			});
			go.add(clickGo);
			
			JLabel choosen = new JLabel("");
			
			JLabel label = new JLabel("<html><h1>------------------------------------------------------<br>" +
	 				"Okay next question...<br>" +
	 				"------------------------------------------------------<br>" +
	 				"You are walking down the street heading to school and you encounter a homeless man sitting against the wallside.<br>"+
	 				"He sees you walk by and asks you for spare change or any food. What do you do?<br>"+
	 				"------------------------------------------------------<br>"+
	 				"1 = Locate your wallet and give him cash<br>"+
	 				"2 = Pull out your lunch box and give him some of your lunch clothes<br>"+
	 				"3 = Ignore him<br>"+
	 				"------------------------------------------------------<br></h1></html>");
			label.setForeground(Color.white);
			Font font = new Font("Helvetica", Font.PLAIN, 18);
			label.setFont(font);
		
		    ImageIcon	image1 = new ImageIcon(getClass().getResource("Button 1.png"));
			JButton jb1 = new JButton(image1);
			jb1.setContentAreaFilled(false);
				//jb1.setBorderPainted(false);
			jb1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					clickGo.setText("You have choosen one");
				}
			});
			
			ImageIcon image2 = new ImageIcon(getClass().getResource("Button 2.png"));
			JButton jb2 = new JButton(image2);
			jb2.setContentAreaFilled(false);
			jb2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					clickGo.setText("You have choosen two");
				}
			});
			
			ImageIcon image3 = new ImageIcon(getClass().getResource("Button 3.png"));
			JButton jb3 = new JButton(image3);
			jb3.setContentAreaFilled(false);	
			jb3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					clickGo.setText("You have choosen three");
				}
			});
			
			
		
			questionLabels.add(choosen);
			questionLabels.add(jb1);
			questionLabels.add(jb2);
			questionLabels.add(jb3);
			//labels.add(choosen);
		
			questionPanel2.add(label ,BorderLayout.NORTH);
			questionPanel2.add(questionLabels, BorderLayout.CENTER);
			questionPanel2.add(go, BorderLayout.SOUTH);
		
			add(questionPanel2);
			repaint();
			revalidate();
	
		}
	
	
		public void QuestionScreen3()
		{
	remove(questionPanel2);
			questionPanel3 = new JPanel();
			
			JPanel questionLabels = new JPanel();
			
			questionPanel3.setLayout(new BorderLayout());
			
			questionLabels.setBackground(Color.black);
			questionPanel3.setBackground(Color.black);
			
			
			JPanel go = new JPanel();
			final JButton clickGo = new JButton("Continue");
			clickGo.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					menuScreen();
				}
			});
			go.add(clickGo);
			
			JLabel choosen = new JLabel("");
			
			JLabel label = new JLabel("<html><h1>------------------------------------------------------<br>" +
	 				"My last question...<br>" +
	 				"------------------------------------------------------<br>" +
	 				"You are in a Labratory and there is a scientest that asks you questions that represent different scenerios.<br>"+
	 				"He wants you to answer them. He injects meletonin hormone into your body. You then feel very drousy.<br>"+
	 				"------------------------------------------------------<br>"+
	 				"1 = Comply<br>"+
	 				"2 = Attempt to Resist<br>"+
	 				"3 = Comply<br>"+
	 				"------------------------------------------------------<br></h1></html>");
			label.setForeground(Color.white);
			Font font = new Font("Helvetica", Font.PLAIN, 18);
			label.setFont(font);
		
		    ImageIcon	image1 = new ImageIcon(getClass().getResource("Button 1.png"));
			JButton jb1 = new JButton(image1);
			jb1.setContentAreaFilled(false);
				//jb1.setBorderPainted(false);
			jb1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					clickGo.setText("You have choosen one");
				}
			});
			
			ImageIcon image2 = new ImageIcon(getClass().getResource("Button 2.png"));
			JButton jb2 = new JButton(image2);
			jb2.setContentAreaFilled(false);
			jb2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					clickGo.setText("You have choosen two");
				}
			});
			
			ImageIcon image3 = new ImageIcon(getClass().getResource("Button 3.png"));
			JButton jb3 = new JButton(image3);
			jb3.setContentAreaFilled(false);	
			jb3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					clickGo.setText("You have choosen three");
				}
			});
			
			
		
			questionLabels.add(choosen);
			questionLabels.add(jb1);
			questionLabels.add(jb2);
			questionLabels.add(jb3);
			//labels.add(choosen);
		
			questionPanel3.add(label ,BorderLayout.NORTH);
			questionPanel3.add(questionLabels, BorderLayout.CENTER);
			questionPanel3.add(go, BorderLayout.SOUTH);
		
			add(questionPanel3);
			repaint();
			revalidate();







}



		
	public int stopThread()
	{
		return stopThread;
	}
	public void menuScreen()
	{
		remove(questionPanel3);
		revalidate();
		repaint();
		
		JPanel menuScreen = new JPanel();
		
		menuScreen.setLayout(new GridLayout(2,2));
		
		JPanel panelUpperL = new JPanel();
		panelUpperL.setBackground(Color.BLACK);
		
		JLabel story = new JLabel();
		story.setText("<html> Bedroom"
				+ "<br><br> As shapes start to take form in your dream you find yourself in a bedroom "
				+ "<br> ,your bedroom. It’s weird; it’s almost as if you’ve awoken from your childhood home."
				+ "<br> You know something is off and not right in this place. It is completely calm "
				+ "<br>and it is dusk outside."
				+ "<br><br> 1 Observe out the window"
				+ "<br><br> 2 Crawl into the bed"
				+ "<br><br> 3 Climb up the fireplace</html>");

		story.setForeground(Color.WHITE);
		
		panelUpperL.add(story);
		
		  ImageIcon	image1 = new ImageIcon(getClass().getResource("Button 1.png"));
		  JButton sb1 = new JButton(image1);
		  sb1.setContentAreaFilled(false);
		  sb1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					story.setText("");
				}
			});
		  
		  panelUpperL.add(sb1);
		  
			
		  ImageIcon	image2 = new ImageIcon(getClass().getResource("Button 2.png"));
		  JButton sb2 = new JButton(image2);
		  sb2.setContentAreaFilled(false);
		  sb2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					story.setText("");
				}
			});
		  
		  panelUpperL.add(sb2);
		  
		  ImageIcon	image3 = new ImageIcon(getClass().getResource("Button 3.png"));
		  JButton sb3 = new JButton(image3);
		  sb3.setContentAreaFilled(false);
		  sb3.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					story.setText("");
				}
			});
		  
		  panelUpperL.add(sb3);

		
		
		JPanel panelUpperR = new JPanel();
		panelUpperR.setBackground(Color.BLUE);
		
		
		
		
		JPanel panelLowerL = new JPanel();
		panelLowerL.setBackground(Color.GREEN);
		
		JLabel  lucidity = new JLabel("Lucidity");
		
		
		JPanel panelLowerR = new JPanel();
		panelLowerR.setBackground(Color.BLACK);
		
		
		
		menuScreen.add(panelUpperL);
		menuScreen.add(panelUpperR);
		menuScreen.add(panelLowerL);
		menuScreen.add(panelLowerR);
		
		add(menuScreen);
		repaint();
		revalidate();
		
		
		
		
		
		
	}
	
}
