import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

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
		
		Timer timer = new Timer(1000, listener);
		timer.start();
		
		Button button = new Button();
		frame.add(button);
		

        frame.setSize(225, 100);
        frame.setVisible(true);
		
    }
	
}