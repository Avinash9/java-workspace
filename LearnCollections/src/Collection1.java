import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeMap;

public class Collection1 {
	private TreeMap<String, Integer> treeMap;
	private HashMap<String, Integer> hashMap;
	private ArrayList<String> arrayList;
	private LinkedList<String> linkList;
	private ArrayList<TreeMap<String, String>> compositeStructure;
	public static void main(String[] args) {
		System.out.println("in main method!!!!!");
		Collection1 col = new Collection1();
		System.out.println("Tree Map:" + col.setTreeMap());
		System.out.println("Hash Map:" + col.setHashmap());
		System.out.println("Array List:"+col.setArrayList());
		System.out.println("Link List"+col.setLinkList());
		System.out.println("composite structure is"+col.setCompositeStructure());
	}

	/*
	 * ######################### TreeMap Example################ 
	 * TreeMap is
	 * similar to dictionary in python but sorted on the basis of key key can
	 * also be null
	 */
	public TreeMap<String, Integer> setTreeMap() {
		treeMap = new TreeMap<String, Integer>();
		treeMap.put("zebra", 1);
		treeMap.put("monkey", 2);
		treeMap.put("Lion", 200);
		treeMap.put("Ape", 500);
		treeMap.put("Fox", 300);
		treeMap.put("Fox", 900);
		treeMap.put("", 800);

		/*
		 * for(String key: treeMap.keySet()) {
		 * System.out.println("Tree Map ootcome:"+key+"   "+treeMap.get(key)); }
		 */

		return treeMap;
	}

	/*
	 * #########################HashMap Example################ 
	 * HashMap makes no
	 * guarantees as to the order of the map; in particular, it does not
	 * guarantee that the order will remain constant over time. putAll() method
	 * helps us to copy another collections to HashMap object.
	 */
	public HashMap<String, Integer> setHashmap() {
		hashMap = new HashMap<String, Integer>();
		hashMap.put("Zebra", 1);
		hashMap.put("monkey", 2);
		hashMap.put("Lion", 200);
		hashMap.put("Ape", 500);
		hashMap.put("Fox", 300);
		hashMap.put("Fox", 800);
		hashMap.put("test", 800);
		hashMap.put("", 8009);
		hashMap.putAll(treeMap);

		/*
		 * for(String key: hashMap.keySet()) {
		 * System.out.println("HASH MAP OUTCOME:"+key+""+hashMap.get(key)); }
		 */

		return hashMap;
	}

	/*
	 * ######################### ArrayList Example################
	 * Resizable-array implementation of the List
	 * duplicates are allowed
	 * used to store an “ordered” group of elements where duplicates are allowed.
	 *  permits all elements, including null.
	 */
	public ArrayList<String> setArrayList() {
		arrayList = new ArrayList<String>();
		arrayList.add("first");
		arrayList.add("second");
		arrayList.add("third");
		arrayList.add("fourth");
		arrayList.add("Fifth");
		arrayList.add(1, "added now");
		arrayList.add(0, "added first");
		int lastIndex=arrayList.size()-1;
		arrayList.add(lastIndex, "added last");
		
		/*
		 * Iterator i=arrayList.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}*/
//		System.out.println(arrayList.get(3));
		return arrayList;
	}
	
	/*
	 * ######################### LinkList Example################
	 *the LinkedList class provides uniformly named methods to get, 
	 *remove and insert an element at the beginning and end of the list
	 *reverse LinkedList content
	 **/
	
	public LinkedList<String> setLinkList()
	{
		linkList=new LinkedList<String>();
		linkList.add("first");
		linkList.add("second");
		linkList.add("third");
		linkList.add("fourth");
		linkList.addFirst("added first");
		linkList.add(2, "added now");
		return linkList;
		
	}
	
	
	
	/*
	 * ######################### CompositeStructure Example################
	 * 
	 * */
	
	public ArrayList<TreeMap<String ,String>> setCompositeStructure()
	{
		compositeStructure=new ArrayList<TreeMap<String,String>>();
		for(String key:treeMap.keySet())
		{
			TreeMap<String, String> testTreeMap=new TreeMap<String,String>();
			testTreeMap.put("name", "test1");
			testTreeMap.put("id", "1");
			compositeStructure.add(testTreeMap);
		}
		return compositeStructure;
		
	}

}
