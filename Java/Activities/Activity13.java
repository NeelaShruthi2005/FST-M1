package Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner scan = new Scanner(System.in);
		List<Integer> list =new ArrayList<Integer>();
		Random indexGen = new Random();
		
		System.out.println("enter Numbers:");
		while(scan.hasNextInt()) {
		    list.add(scan.nextInt());
		}
		
		scan.close();
		
		Integer nums[] = list.toArray(new Integer[0]);
		int index = indexGen.nextInt(nums.length);
		
		System.out.println("random index generated is: "+ index);
		System.out.println("value at that index is: "+nums[index]);
		

	}

}
