import java.util.Iterator;
import java.util.Stack;

class Demo
{
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        Iterator it = s.iterator();
//         while(it.hasNext())
//         {
//             System.out.println(it.next());
//         }
        it.next();
        it.next();
        it.remove();
        System.out.println(s);
    }
}
