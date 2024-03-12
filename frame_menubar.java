import java.awt.*;
/*
 <applet code="frame_menubar.class" height="500" width="1000">
 </applet>
 */
public class frame_menubar extends Frame
{
    frame_menubar(String title)
    {
        super(title);
        
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        Menu file = new Menu("File");
        mb.add(file);

        MenuItem New = new MenuItem("New");
        file.add(New);
        MenuItem open = new MenuItem("open");
        file.add(open);
        MenuItem save = new MenuItem("save");
        file.add(save);
        Menu edit = new Menu("Edit");
        file.add(edit);

        MenuItem cut = new MenuItem("cut");
        edit.add(cut);
        MenuItem copy = new MenuItem("copy");
        edit.add(copy);
        MenuItem Paste = new MenuItem("Paste");
        edit.add(Paste);
        
    }
    public static void main(String[] args) {
        frame_menubar fm = new frame_menubar("Menu");
        fm.setSize(300,300);
        fm.setVisible(true);

    }
    
}