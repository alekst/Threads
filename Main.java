import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.JButton;

public class Main{
	
    public static void main(String[] args) {

        JFrame frame = new JFrame("Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());


        JLabel label = new JLabel("Count: 0");
		
		JLabel another = new JLabel("Count: 0");
		
		
        frame.add(label);
		frame.add(another);
		
		MyListener listener = new MyListener(label);
		MyListener listener2 = new MyListener(another);
		
		Timer timer = new Timer(1000, listener);
		timer.start();
		Timer timer2 = new Timer(1000, listener2);
		
		JButton button = new JButton("Change");
		button.addActionListener(new ButtonListener(timer, timer2));
		frame.add(button);
		

        frame.setSize(225, 100);
        frame.setVisible(true);
		
    }
	
}