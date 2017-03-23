import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Button extends JButton 
{
	
	public Button()
	{
		super("Change");
		this.addActionListener(new ButtonListener());
		this.setEnabled(true);
	}
	
}