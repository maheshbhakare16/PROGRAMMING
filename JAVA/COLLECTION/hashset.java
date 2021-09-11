import java.util.*;
class hashset
{
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("a");
		h.add("b");
		h.add("c");
		h.add(null);
		System.out.println(h.add("110"));
		System.out.println(h);
	}
}
