import java.util.List;
import java.util.ArrayList;
class Demo
{
    public static void main(String[] args)
    {
        List l = new ArrayList();
        l.add(0,'A');
        l.add(1,'B');
        l.add(2,"Demo");
        
        List l1 = new ArrayList();
        l1.add(0,"Test");
        l1.add(1,"Best");
        
        l1.addAll(1,l);
        
        l.set(2,100);
        
        System.out.println(l.get(1));
        
        System.out.println(l.indexOf(100));
        
        System.out.println(l.lastIndexOf(100));
        
        l.remove(0);
        
        l.retainAll(l1);
    }
    
}
