package Week3Day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class FindMissingElement {

	public static void main(String[] args) {
	
		int[] Array1 ={1, 2, 3, 4, 10, 6, 8};
		
		List <Integer> mylist = new ArrayList<Integer>();
		
		for (Integer i : Array1) {
		
		
			mylist.add(i);
		}
		
		Collections.sort(mylist);
		
		System.out.println("Sorted list: " + mylist);
		
		 for (int i = 0; i < mylist.size() - 1; i++) {
	            if (mylist.get(i) + 1 != mylist.get(i + 1)) {
	                System.out.println("Missing number: " + (mylist.get(i) + 1));
	            }
	        }
	    }
	}
