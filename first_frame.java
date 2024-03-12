import java.awt.*;

class first_frame
{
    public static void main(String args[])
    {
        Frame f=new Frame("java frame");
        f.setSize(300,300);
        f.setVisible(true);
        Label b= new Label("b1");
       // b.setBounds(100,100,50,50);
        f.add(b);
    }
}