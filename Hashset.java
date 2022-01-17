package core.programs;

import java.util.HashSet;

public class Hashset {

		public static void main(String[] args){
			
			//LinkedHashSet<String> hs=new LinkedHashSet<String>();
			HashSet<String>fruits=new HashSet<String>();
			
			fruits.add("mango");
			fruits.add("apple");
			fruits.add("guava");
			fruits.add("orange");
			fruits.add("pear");
			fruits.add("grapes");
			fruits.add("strawberry");
					
			System.out.println("Hashset is "+fruits);
			System.out.println("Size of Hashset is "+ fruits.size());
			System.out.println("remove the element "+fruits.remove("apple"));
			
             HashSet<String>fruits1=new HashSet<String>();
			
			fruits.add("papa");
			fruits.add("loha");
			fruits.add("manasa");
			System.out.println("Hashset is "+fruits);
			System.out.println(" Hashset contains orange or not:" +fruits.contains("orange"));
			
			
			
		    System.out.println("is hashset empty  " +fruits.isEmpty());
		}
		
		    
		  

	}

