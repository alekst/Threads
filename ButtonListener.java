import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ButtonListener implements ActionListener{

    private int count = 0;
	
	private JLabel label;
	private Timer timer, other;

    public ButtonListener(Timer timer, Timer another){
		super();
		this.timer = timer;
		this.other = another;

    }

    public void actionPerformed(ActionEvent e) {
		//System.out.println("I am here");
		timer.stop();
		other.start();
		Timer temp = timer;
		timer = other;
		other = temp;
    }
	
}