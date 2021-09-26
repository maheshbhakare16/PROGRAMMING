import java.util.*;
  
 class IHMap {
  
    public static void main(String[] args)
    {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(10, "a");
        hm.put(20, "f");
        hm.put(20, "e");
        hm.put(30, "b");
        hm.put(40, "c");
        hm.put(50, "d");
        System.out.println(hm);
         
        IdentityHashMap<Integer, String> ihmap = new IdentityHashMap<Integer, String>();
  
      
        ihmap.put(10, "a");
        ihmap.put(20, "f");
        ihmap.put(20, "e");
        ihmap.put(30, "b");
        ihmap.put(40, "c");
        ihmap.put(50, "d");
  
      System.out.println(ihmap);
    }
}
