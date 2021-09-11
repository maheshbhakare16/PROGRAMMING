import java.util.*;
class Linkedhashset
{
	public static void main(String[] args) {
		LinkedHashSet h=new LinkedHashSet();
		h.add("A");
		h.add("B");
		h.add(20);
		h.add(10);
		h.add("D");
		h.add("X");
		h.add(null);
		h.add(2.36);
		System.out.println(h.add("Z"));
		System.out.println(h);
	}
}
