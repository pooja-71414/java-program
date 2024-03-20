import java.applet.*;
import java.awt.*;
/*<applet code="aa" width=300 height=300>
 </applet>
 */
public class aa extends Applet 
{
    public void paint(Graphics g)
    {
        
    int ascent = g.getFontMetrics().getAscent();
    int descent = g.getFontMetrics().getDescent();
    int height = g.getFontMetrics().getHeight();
    int leading = g.getFontMetrics().getLeading();

    String one = "Ascent of font f1 is :" + ascent+"Descent of font f1 is :" + descent+"Height of font f1 is :" + height+"Leading of font f1 is :" + leading;
    g.drawString(one, 120, 100);
    g.drawLine(120,100+descent,200,100+descent);
    g.drawLine(120,100-descent,200,100-descent);

    g.drawLine(ascent,descent,height,leading);
    

    }
}
