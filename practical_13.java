/*import java.awt.*;
public class practical_13 extends Frame
{
    practical_13(String title)
    {
        super(title);
        
        MenuBar mb = new MenuBar();
        setMenuBar(mb);
        Menu file = new Menu("File");
        mb.add(file);
        Menu edit = new Menu("Edit");
        mb.add(edit);

        MenuItem New = new MenuItem("New");
        file.add(New);
        MenuItem open = new MenuItem("Open");
        file.add(open);
        MenuItem save = new MenuItem("Save");
        file.add(save);
        MenuItem exit = new MenuItem("Exit");
        file.add(exit);
        
        MenuItem cut = new MenuItem("Cut");
        edit.add(cut);
        MenuItem copy = new MenuItem("Copy");
        edit.add(copy);
        MenuItem Paste = new MenuItem("Paste");
        edit.add(Paste);
        
    }
    public static void main(String[] args) {
        practical_13 fm = new practical_13("My Frame");
        fm.setSize(300,300);
        fm.setVisible(true);

    }
    
}

*/



import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class practical_13 {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Frame");
        JMenuBar mb = new JMenuBar();
        f.setJMenuBar(mb);
        JMenu file = new JMenu("File");
        mb.add(file);
        JMenu edit = new JMenu("Edit");
        mb.add(edit);
        JMenuItem New = new JMenuItem("New");
        file.add(New);
        JMenuItem open = new JMenuItem("Open");
        file.add(open);
        JMenuItem save = new JMenuItem("Save");
        file.add(save);
        JMenuItem exit = new JMenuItem("Exit");
        file.add(exit);
        JMenuItem cut = new JMenuItem("Cut");
        edit.add(cut);
        JMenuItem copy = new JMenuItem("Copy");
        edit.add(copy);
        JMenuItem paste = new JMenuItem("Paste");
        edit.add(paste);
        f.setSize(300,300);
        f.setVisible(true);
         
    }
}