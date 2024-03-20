import java.awt.*;
public class layout_frame {
    public static void main(String[] args) {
        Frame f = new Frame();
        // Button b = new Button("NORTH");
        // Button b1 = new Button("SOUTH");
        // Button b2 = new Button("EAST");
        // Button b3 = new Button("WEST");
        // Button b4 = new Button("CENTER");
        // f.setLayout(new BorderLayout());
        // f.setLayout(new BorderLayout(10,30));
        // f.add(b,BorderLayout.NORTH);
        // f.add(b1,BorderLayout.SOUTH);
        // f.add(b2,BorderLayout.EAST);
        // f.add(b3,BorderLayout.WEST);
        // f.add(b4,BorderLayout.CENTER);


        Button b = new Button("1");
        Button b1 = new Button("2");
        Button b2 = new Button("3");
        Button b3 = new Button("4");
        Button b4 = new Button("5");
        // f.setLayout(new GridLayout());
        // f.setLayout(new FlowLayout());
        f.setLayout(new FlowLayout(FlowLayout.LEFT,20,25));
        // f.setLayout(new BoxLayout(f,BoxLayout.X_AXIS));
        // f.setLayout(new BoxLayout(f,BoxLayout.Y_AXIS));
        // f.setLayout(new GridLayout(2,3));
        // f.setLayout(new CardLayout());
        // f.setLayout(new GridLayout());
        // f.setLayout(new GridLayout());
        // f.setLayout(new GridLayout());
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);


        f.setSize(300,300);
        f.setVisible(true);
    }
}
