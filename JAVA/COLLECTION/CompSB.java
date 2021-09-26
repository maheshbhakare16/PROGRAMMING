import java.util.Comparator;
import java.util.TreeSet;


class MyComparator implements Comparator<StringBuilder>
{
    public int compare(StringBuilder sb1, StringBuilder sb2)
    {
        return new String(sb1).compareTo(new String(sb2));
    }
}

class Test
{
    public static void main(String[] args)
    {
        Comparator c = new MyComparator();
        
        TreeSet ts = new TreeSet(c);
        ts.add(new StringBuilder("A"));
        ts.add(new StringBuilder("C"));
        ts.add(new StringBuilder("B"));
        ts.add(new StringBuilder("F"));
        ts.add(new StringBuilder("D"));
        ts.add(new StringBuilder("Q"));
        ts.add(new StringBuilder("N"));
        System.out.println(ts);
        
    }
}
