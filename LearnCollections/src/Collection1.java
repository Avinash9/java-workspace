import java.util.HashMap;
import java.util.TreeMap;


public class Collection1 {
	
	
	private TreeMap<String, Integer> treeMap;
	private HashMap<String, Integer> hashMap;

	public static void main(String[] args) {
		System.out.println("in main method!!!!!");
		Collection1 col=new Collection1();
		System.out.println("Tree Map:"+col.setTreeMap());
		System.out.println("Hash Map:"+col.setHashmap());
	}
	
	/*	
	TreeMap is similar to dictionary in python 
	but sorted on the basis of key
	key can also be null
	*/
	public TreeMap<String, Integer> setTreeMap()
	{
		treeMap=new TreeMap<String,Integer>();
		treeMap.put("zebra", 1);
		treeMap.put("monkey", 2);
		treeMap.put("Lion", 200);
		treeMap.put("Ape", 500);
		treeMap.put("Fox", 300);
		treeMap.put("Fox", 900);
		treeMap.put("", 800);
		
		/*for(String key: treeMap.keySet())
		{
			System.out.println("Tree Map ootcome:"+key+"   "+treeMap.get(key));
		}*/
		
		return treeMap;
	}
	
/*	
    HashMap makes no guarantees as to the order
    of the map; in particular, 
	it does not guarantee that the order 
	will remain constant over time.
	putAll() method helps us to copy 
	another collections to HashMap object.
*/
	public HashMap<String, Integer> setHashmap()
	{
		hashMap=new HashMap<String,Integer>();
		hashMap.put("Zebra", 1);
		hashMap.put("monkey", 2);
		hashMap.put("Lion", 200);
		hashMap.put("Ape", 500);
		hashMap.put("Fox", 300);
		hashMap.put("Fox", 800);
		hashMap.put("test", 800);
		hashMap.put("", 8009);
		hashMap.putAll(treeMap);

		/*for(String key: hashMap.keySet())
		{
			System.out.println("HASH MAP OUTCOME:"+key+""+hashMap.get(key));
		}*/
		
		return hashMap;
	}
	

}
