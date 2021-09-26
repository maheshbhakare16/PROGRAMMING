import java.util.ArrayDeque;

class QueueTwo
{
    public static void main(String[] args)
    {
        ArrayDeque q1 = new ArrayDeque();
        q1.add(1);
        q1.offer(2);
        q1.offer(3);
        q1.offer(4);
        q1.offer(5);
        q1.offer(6);
        
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.poll());
        
    }
}
