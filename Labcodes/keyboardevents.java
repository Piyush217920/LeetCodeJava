package SecondSem;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// To demonstrate the working of Keyboard Events

public class KeyboardEvents extends Applet implements KeyListener , ActionListener 
{
	Label	purpose;
	char	keyChar = ' ';
	int		number = 0;
	String	string1 = " ", string2 = " ", string3 = " ", string4 = " ";
	Button 	start;
	public void init()  // Note you should be able to requestFocus() in init (see below) but due to a	
	                           // glitch this will only work if a start  button press actually activates    
                requestFocus()
	{
		requestFocus();		// should make the applet the active component for Key events
		start = new Button("START");		
		add(start);
		start.addActionListener(this);
		addKeyListener(this);		// allow applet to process Key events
		purpose = new Label("The purpose of this program is to show how Keyboard Events work");
		add(purpose);	
	}// end init
	
	// All keyboard events must include all  methods below:
public void keyPressed(KeyEvent e)
	{
		number++;				// add 1 to count of key presses
		string1 = e.getKeyText(e.getKeyCode());	// show which key is pressed
		if(e.getKeyCode() == e.VK_UP)			// see if UP arrow key is pressed
			string2 = "Up Arrow key";
		if(e.getKeyCode() == e.VK_DOWN)		// see if DOWN arrow key is pressed
			string2 = "Down Arrow key";
		if(e.getKeyCode() == e.VK_LEFT)			// see if LEFT arrow key is pressed
			string2 = "Left Arrow key";
		if(e.getKeyCode() == e.VK_RIGHT)		// see if Right arrow key is pressed
			string2 = "Right Arrow key";
		if(e.getKeyCode() == e.VK_ENTER)	         // see if ENTER key is pressed
			string2 = "Enter key";
		repaint();

	} // end keyPressed
	
	public void keyReleased(KeyEvent e)
	{
		string4 = e.getKeyText(e.getKeyCode());
		repaint();

	} // end keyReleased
	

	public void keyTyped(KeyEvent e)
	{
		keyChar = e.getKeyChar();		// to get the actual Unicode character typed
		if(keyChar == 'x')
                       string3 = "The key lower case x was pressed";
    		repaint();

	}     // end keyTyped
	
	public void paint(Graphics g)
	{
		g.drawString("Number of keys pressed is : " + number, 20, 60);
		g.drawString("Character pressed is : " + keyChar, 20,80);
		g.drawString("Key pressed is : " + string1, 20, 100);
		g.drawString("Key released is : " + string4, 20, 120);
		g.drawString("Action key pressed is : " + string2, 20, 140);
                        g.drawString(string3, 20, 160);
	
	}// end paint

	public void actionPerformed(ActionEvent e)
	{
		requestFocus();

	} // end actionPerformed

}// end KeyboardEvents
