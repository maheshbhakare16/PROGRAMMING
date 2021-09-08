import java.util.ListIterator;
import java.util.Stack;

class Demo
{
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        ListIterator ls = s.listIterator();
//         while(ls.hasNext())
//         {
//             System.out.println(ls.next());
//         }
        ls.next();
        ls.next();
        ls.remove();
        System.out.println(s);
        ls.add(100);
        ls.add(200);
        System.out.println(s);
        while(ls.hasPrevious())
        {
            System.out.println(ls.previousIndex()+" : "+ls.previous());
        }
    }
}
