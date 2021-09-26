import java.util.*;  
class QueueOne
{  
    public static void main(String args[])
    {  
        PriorityQueue queue=new PriorityQueue();  
        queue.add(1);  
        queue.add(2);  
        queue.add(3);  
        queue.add(4);  
        queue.add(5);  
        System.out.println("head:"+queue.element());  
        System.out.println("head:"+queue.peek());  
        System.out.println("iterating the queue elements:");  
        Iterator itr=queue.iterator();  
        while(itr.hasNext())
        {  
            System.out.println(itr.next());  
        }  
        queue.remove();  
        queue.poll();  
        System.out.println("after removing two elements:");  
        Iterator itr2=queue.iterator();  
        while(itr2.hasNext())
        {  
            System.out.println(itr2.next());  
        }  
    }  
}  
