import java.applet.*;
import java.awt.*;
/* <applet code = als width=400 height=500>
</applet>*/
public class als extends Applet {
	public void init()
	{
		setBackground(Color.black);
		setForeground(Color.yellow);
	}
	public void paint(Graphics g)
	{
		g.drawString("Welcome to Applets", 50, 50);
	}
}
