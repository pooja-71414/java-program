import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;
 
public class scroll {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setLayout(new FlowLayout());
        JProgressBar p = new JProgressBar(0,100);
        JButton b=new JButton("start");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae){
                
            }
        });

    }
}
