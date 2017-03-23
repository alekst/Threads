import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class MyListener implements ActionListener{

    private int count = 0;

    private JLabel label;

    public MyListener(JLabel label){
        this.label = label;
    }

    public void actionPerformed(ActionEvent e) {

        count++;

        label.setText("Count: " + count);
    }
}