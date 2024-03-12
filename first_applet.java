import java.applet.*;
import java.awt.*;
public class first_applet extends Applet
{
    public void paint(Graphics g)
    {
        g.drawString("applet example", 100, 100);
    }
}
/*
<applet code="first_applet.class" height="500" width="1000">
</applet>
 */