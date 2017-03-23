import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonListener implements ActionListener{

    private int count = 0;
	
	private JLabel label;
	private Timer timer, other;

    public ButtonListener(){
		// this.label = label;
	// 	this.timer = timer;
	// 	this.other = other;

    }

    public void actionPerformed(ActionEvent e) {
		// timer.stop();
// 		other.start();
		Main.stop();
    }
	
}