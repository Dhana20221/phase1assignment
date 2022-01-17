package core.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class Treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        
        linkedHashMap.put(1, new String("banana"));
        linkedHashMap.put(2, new String("apple"));
        linkedHashMap.put(3, new String("mangoa"));
        linkedHashMap.put(4, new String("grapes"));
        linkedHashMap.put(5, new String("papaya"));
        linkedHashMap.put(6, new String("guava"));
        linkedHashMap.put(7, new String("pear"));
        
        
        System.out.println("Contents of LinkedHashMap : " + linkedHashMap);
        System.out.println("\nValues of map after iterating over it : ");
        
        for (Integer key : linkedHashMap.keySet()) {
            System.out.println(key + ":\t" + linkedHashMap.get(key));
           
        }
        
        System.out.println("\nThe size of the LinkedHashMap is : " + linkedHashMap.size());
        System.out.println("\nIs LinkedHashMap empty? : " + linkedHashMap.isEmpty());
        System.out.println("\nLinkedHashMap contains 2 as key? : " + linkedHashMap.containsKey(2));
        System.out.println("LinkedHashMap contains pear as value? : " + linkedHashMap.containsValue("HCL"));
        System.out.println("\nRemove entry for key 4 : " + linkedHashMap.remove(4));
        System.out.println("Content of LinkedHashMap after removing key 2: " + linkedHashMap);
        System.out.println("\nRemove entry for key 7 : " + linkedHashMap.remove(7));
        System.out.println("\nLinkedHashMap contains 4 as key? : " + linkedHashMap.containsKey(4));
        linkedHashMap.clear();
        System.out.println("\nContent of LinkedHashMap after clearing: " + linkedHashMap);
    }



	}

