
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class jlist {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setLayout(new FlowLayout());
       // f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b = new JButton("show");
        JLabel l1 = new JLabel();
        DefaultListModel<String> aa = new DefaultListModel<>();
        aa.addElement("l1.item1");
        aa.addElement("l1.item2");
        aa.addElement("l1.item3");
        aa.addElement("l1.item4");
        aa.addElement("l1.item5");
        JLabel l = new JLabel();
        DefaultListModel<String> bb = new DefaultListModel<>();
        bb.addElement("l2.item1");
        bb.addElement("l2.item2");
        bb.addElement("l2.item3");
        bb.addElement("l2.item4");
        bb.addElement("l2.item5");
        
        final JList list1 = new JList<>(aa);
        final JList list2 = new JList<>(bb);
        
        f.add(list1);
        f.add(list2);
        f.add(b);
        f.add(l);
        f.add(l1);

        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String data;
                data = "selected items = "+ list1.getSelectedValue();
                l.setText(data);
                data = "   "+list2.getSelectedValue();
                l1.setText(data);
            }
        });
    }
}
