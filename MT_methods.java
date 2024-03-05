/*public class MT_methods 
{
    public static void main(String[] args) 
    {
        
    }    
}*/

/*
class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getId() + " Value " + i);
        }
    }
}

public class MT_methods {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        t1.start();

        MyThread t2 = new MyThread();
        t2.start();

        // Using isAlive() method
        System.out.println("Thread 1 is alive: " + t1.isAlive());
        System.out.println("Thread 2 is alive: " + t2.isAlive());

        try {
            // Using join() method to wait for threads to finish
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Using isAlive() method after threads have finished
        System.out.println("Thread 1 is alive: " + t1.isAlive());
        System.out.println("Thread 2 is alive: " + t2.isAlive());

        System.out.println("Main thread exiting.");
    }
}
*/


class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
        try {
            Thread.sleep(2000); // Simulating some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread is done");
    }
}

public class MT_methods {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        System.out.println("Before starting the thread: isAlive = " + myThread.isAlive());

        myThread.start();

        System.out.println("After starting the thread: isAlive = " + myThread.isAlive());

        try {
            myThread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After joining the thread: isAlive = " + myThread.isAlive());
        System.out.println("Main thread is done");
    }
}

