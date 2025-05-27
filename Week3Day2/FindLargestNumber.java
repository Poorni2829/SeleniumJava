package Week3Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindLargestNumber {

    public static void main(String[] args) {
        
        int[] array1 = {3, 2, 11, 4, 6, 7};
        
        // Create a list and add array elements to it
        List<Integer> myLil = new ArrayList<>();
        
        for (int i : array1) {
            myLil.add(i);
        }

        System.out.println("List from array: " + myLil);
        
        // Sort the list in ascending order
        Collections.sort(myLil);

        System.out.println("Sorted list: " + myLil);

        // Find and print the largest number (last element after sorting)
        int largest = myLil.get(myLil.size() - 2);
        System.out.println("Largest number: " + largest);
    }
}
