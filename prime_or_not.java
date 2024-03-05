import java.util.Scanner;
public class prime_or_not {
    public static void main(String[] args) {
        int i,j,a=0;
        Scanner s=new Scanner(System.in);
        System.out.print("enter the number = ");
        i=s.nextInt();
        s.close();

        for (j=2;j<i;j++)
        {
            if(i%j==0)
            {
                //System.out.println("not a prime number");
                a=1;
                break;
            }
        }
        if(a==1)
        {
            System.out.println("not a prime number");   
        }
        else
        {
            System.out.println("prime number");   
        }
    }
}
