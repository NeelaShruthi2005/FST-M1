package Examples;

import java.util.HashSet;

public class Activity10 {
	 public static void main(String[] args) {
	        HashSet<String> hs = new HashSet<String>();
	        hs.add("a");
	        hs.add("b");
	        hs.add("c");
	        hs.add("d");
	       // hs.add("z");
	        
	        System.out.println("Original HashSet: " + hs);        
	        System.out.println("Size of HashSet: " + hs.size());
	        
	        System.out.println("Removing a from HashSet: " + hs.remove("a"));
	        if(hs.remove("z")) {
	        	System.out.println("z removed from the Set");
	        } else {
	        	System.out.println("z is not present in the Set");
	        }
	        
	        //Search for element
	        System.out.println("Checking if M is present: " + hs.contains("M"));
	        //Print updated HashSet
	        System.out.println("Updated HashSet: " + hs);
	    }
}
