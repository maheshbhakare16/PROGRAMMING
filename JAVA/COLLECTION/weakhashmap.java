import java.util.Map;
import java.util.WeakHashMap;
class WHMap
{
	public static void main(String[] args)
	{
		Map<Number, String> whmap = new WeakHashMap<Number, String>();
		
		whmap.put(1, "A");
		whmap.put(2, "B");
		whmap.put(3, "C");
		whmap.put(4, "D");
		whmap.put(5, "E");

	
		System.out.println("WeakHashMap is : " + whmap);

	
		if (whmap.containsValue("welcomes"))
			System.out.println("Yes welcomes exist");

		
		if (whmap.containsKey(3))
			System.out.println("Yes 3 exist");
		

		Set keyset = whmap.keySet();
		
	
		System.out.println("key Set : " + keyset);
		
		Collection values = whmap.values();
		
		System.out.println("Values : " + values);

	
		whmap.clear();

		if (whmap.isEmpty())
			System.out.println("Empty WeakHashMap: " + whmap);
	}
}
