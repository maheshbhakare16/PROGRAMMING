import java.util.Stack;

class Demo
{
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        System.out.println(s.empty());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search(20));
        s.pop();
        s.pop();
        System.out.println(s.empty());
        System.out.println(s.peek());
    }
}
