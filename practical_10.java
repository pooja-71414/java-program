
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/* <applet code = practical_10 width=400 height=500>
</applet>*/
public class practical_10 extends Applet implements MouseListener {
    
    java.awt.Color color = Color.green;

    public void init() {
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        g.setColor(this.color);
        g.drawRect(10, 30, 150, 150); // Draw a rectangle
    }

    public void mouseClicked(MouseEvent e) {
        this.color = Color.red; // Change color to red
        this.repaint(); // Refresh the display
    }

    // Other mouse event methods (not used in this example)
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
}
