class a extends Thread {
    void print() {
        for (int i = 0; i < 11; i++) {
            System.out.println("i = " + i);
        }
    }
}

// class b
// {
// for(int j=0;j<11;j++)
// {
// System.out.println("j = "+j);
// }
// }
// class c
// {
// for(int k=0;k<11;k++)
// {
// System.out.println("k = "+k);
// }
// }
public class trd {
    public static void main(String[] args) {
        a aa = new a();
        aa.print();
    }
}