import java.util.Stack;

class stack {
    public static void main(String[] args)
    {
        Stack s=new Stack();
        s.push("aish");
        s.push("baby");
        s.push("cherry");
        s.push("densi");
        System.out.println("before pop() stack = "+s);
        System.out.println("peek() of stack = "+s.peek());
        System.out.println("pop() of stack = "+s.pop());
        System.out.println("after pop() stack ="+s);
        System.out.println("peek() of stack = "+s.peek());
    }    
}
