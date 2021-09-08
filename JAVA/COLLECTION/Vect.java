import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        ArrayList l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        Vector v = new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        Vector v1 = new Vector(20);
        v1.insertElementAt(null,0);
        v1.insertElementAt(null,1);
        v1.insertElementAt("mahesh", 2);
        Vector v2 = new Vector(l);
        Vector v3 = new Vector(10,1);
        System.out.println(v);
        System.out.println(v1);
        System.out.println(v2);
        
        
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        System.out.println(v.elementAt(1));
        v.removeElementAt(1);
        System.out.println(v);
        v.setElementAt(12,1);
        System.out.println(v);
        v2.removeAllElements();
        System.out.println(v2);
    }
}
