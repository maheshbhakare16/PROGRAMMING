import java.util.*;
class CollectionMethods
{
	public static void main(String[] args)
	{
	     ArrayList<Integer> list1=new ArrayList<Integer>(5);
		 ArrayList<Integer> list2=new ArrayList<Integer>(5);

			System.out.println(list1.add(50));
			System.out.println(list1.add(100));
			System.out.println(list1.add(150));
			System.out.println(list2.add(550));
			System.out.println(list2.add(50));
			System.out.println(list2.add(350));
			System.out.println(list2.add(560));
			System.out.println(list1.addAll(list2));
			System.out.println(list1.remove(1));
			System.out.println(list1.removeAll(list2));
			System.out.println(list1.add(150));
			System.out.println(list2.size());
			System.out.println(list1.contains(50));
			System.out.println(list1.containsAll(list2));
			System.out.println(list1.isEmpty());	
	}
}