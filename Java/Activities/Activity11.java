package Examples;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "R");
        hm.put(2, "S");
        hm.put(3, "W");
        hm.put(4, "X");
        hm.put(5, "Y");
 
        // Print the Map
        System.out.println("The Original map: " + hm);
        
        // Remove one colour
        hm.remove(4);
        // Map after removing a colour
        System.out.println("After removing X: " + hm);
        
        // Check if green exists
        if(hm.containsValue("W")) {
            System.out.println("W exists in the Map");
        } else {
            System.out.println("W does not exist in the Map");
        }
        
        // Print the size of the Map
        System.out.println("Number of pairs in the Map is: " + hm.size());
    }
}