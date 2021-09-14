import java.util.TreeSet;
class TSet
{
    public static void main(String[] args)
    {
        TreeSet ts = new TreeSet();
        ts.add(10);
        ts.add(5);
        ts.add(20);
        ts.add(1);
        ts.add(34);
        
        System.out.println(ts);
        System.out.println(ts.ceiling(5));
        System.out.println(ts.floor(5));
        System.out.println(ts.higher(5));
        System.out.println(ts.lower(5));
        System.out.println(ts.descendingSet());
        System.out.println(ts.subSet(5,20));
        System.out.println(ts.isEmpty());
        //System.out.println(ts.subSet(20,5)); //java.lang.IllegalArgumentException --> fromKey > toKey
    }
}
