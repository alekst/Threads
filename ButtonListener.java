import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonListener implements ActionListener{

    private int count = 0;
	
	private JLabel label;
	private Timer timer, other;

    public ButtonListener(){
	// 	this.other = other;

    }

    public void actionPerformed(ActionEvent e) {
		System.out.println("I am here");
    }
	
}