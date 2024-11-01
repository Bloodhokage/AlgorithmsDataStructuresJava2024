package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Colors {
    public static void main(String[] args) {
        
        // 1. Create a new array list, add some colors (strings) and print out the collection
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        System.out.println("Original list: " + colors);
        
        // 2. Iterate through all elements in the array list
        System.out.println("Iterating over elements:");
        for (String color : colors) {
            System.out.println(color);
        }
        
        // 3. Insert an element into the array list at the first position
         colors.addFirst("Yellow");
        System.out.println("After inserting 'Yellow' at the first position: " + colors);
        
        // 4. Retrieve an element (at a specified index) from a given array list
        String elementAtIndex = colors.get(2);
        System.out.println("Element at index 2: " + elementAtIndex);
        
        // 5. Update specific array element by given element
        colors.set(2, "Orange");
        System.out.println("After updating element at index 2 to 'Orange': " + colors);
        
        // 6. Remove the third element from an array list
        colors.remove(2);
        System.out.println("After removing the third element: " + colors);
        
        // 7. Search for an element in an array list
        boolean found = colors.contains("Green");
        System.out.println("\nElement is found? " + found);
        
        // 8. Sort a given array list
        Collections.sort(colors);
        System.out.println("After sorting: " + colors);
        
        // 9. Copy one array list into another
        ArrayList<String> colorsCopy;
        colorsCopy = colors;
        System.out.println("Copied list: " + colorsCopy);
        
        // 10. Reverse elements in an array list
        Collections.reverse(colors);
        System.out.println("After reversing: " + colors);
        
        // 11. Compare two array lists
        boolean areEqual = colors.equals(colorsCopy);
        System.out.println("Are the original and copied lists equal? " + areEqual);
        
        // 12. Empty an array list
        colors.clear();
        System.out.println("After clearing the list: " + colors);
        
        // 13. Test if an array list is empty
        boolean isEmpty = colors.isEmpty();
        System.out.println("Is the list empty? " + isEmpty);
        
        // 14. Increase the size of an array list (ArrayList resizes automatically, but we can ensure capacity)
        colorsCopy.ensureCapacity(6);
        System.out.println("\nIncreased: " + colors);
        
        // 15. Trim the capacity of an array list to the current list size
        colorsCopy.trimToSize();
        System.out.println("\nTrimmed: " + colors.size());

}
}
