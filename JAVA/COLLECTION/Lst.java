import java.util.LinkedList;
import java.util.ArrayList;
class Demo
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        
        LinkedList ll = new LinkedList();
        LinkedList ll1 = new LinkedList(al);
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addLast(30);
        System.out.println(ll);
        System.out.println(ll1);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.offerFirst(70));
        System.out.println(ll.offerLast(100));
        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());
    }
}
