import java.applet.*;
import java.awt.*;
public class applet_list extends Applet
{
    public void init()
    {
        List l = new List();
        l.add("ajay");
        l.add("briz");
        l.add("clan");
        l.add("dyme");
        l.add("escort");

        add(l);
    }
}




/*
<applet code="applet_list.class" height="500" width="1000">
</applet>
 */