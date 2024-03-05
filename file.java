import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.Writer;
import java.util.Scanner;

public class file {
    public static void main(String[] args) throws IOException
    {
        File f = new File("f1.txt");
        /*
        if (f.createNewFile()) {
            System.out.println("file is created..");
        }
        else
        {
            System.out.println("file is already exist....");
        }
        */
        FileWriter ff=new FileWriter(f);
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name : ");
        name=sc.nextLine();
        ff.write("name is : "+name);
        
        sc.close();
        ff.close();
    }
}
