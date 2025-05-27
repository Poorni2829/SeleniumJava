package Week3Day2;

import java.util.ArrayList;
import java.util.List;


public class FindIntersection2 {

	public static void main(String[] args) {
		int Array1[] = {3, 8, 11, 4, 6, 7};
		int Array2[] = {1, 2, 8, 6, 9, 7};
		
		List<Integer> li1 = new ArrayList <Integer>();
		List<Integer> li2 = new ArrayList <Integer>();
		
	    List<Integer> FindIntersection2 = new ArrayList<Integer>();
		
	for (int i : Array1) {
			
			li1.add(i);
			
		}
		for (int i : Array2) {
			
			li2.add(i);
			
		}
		
	System.out.println(li1);
	System.out.println(li2);
		
		for(int i=0;i<Array1.length;i++) {
			
			for (int j = 0; j < Array2.length; j++) {
				
				if((li1.get(i)).equals(li2.get(j)))
				{
	               FindIntersection2.add(li1.get(i));
				}
			}
			
		}
		System.out.println("The Intersecting numbers are"+FindIntersection2);
		
		}
		
	}
			


