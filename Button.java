import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Button extends JButton 
{
	
	public Button()
	{
		super("Change");
		addActionListener(new ButtonListener());
		this.setEnabled(true);
	}
	
}