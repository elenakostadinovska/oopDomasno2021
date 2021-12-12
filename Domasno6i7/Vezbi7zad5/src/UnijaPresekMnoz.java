// Java Program to Get the Union
//& Intersection of Two TreeSet

import java.util.*;

public class UnijaPresekMnoz {
    public static void main(String[] args)
    {

        // New TreeSet1
        TreeSet<Integer> treeSet1 = new TreeSet<>();

        // Add elements to treeSet1
        treeSet1.add(10);
        treeSet1.add(20);
        treeSet1.add(30);

        // New TreeSet1
        TreeSet<Integer> treeSet2 = new TreeSet<>();

        // Add elements to treeSet2
        treeSet2.add(20);
        treeSet2.add(30);
        treeSet2.add(40);
        treeSet2.add(50);

        // Print the TreeSet1
        System.out.println("TreeSet1: " + treeSet1);

        // Print the TreeSet1
        System.out.println("TreeSet2: " + treeSet2);

        // New TreeSet
        TreeSet<Integer> union = new TreeSet<>();

        // Get a Union using addAll() method
        union.addAll(treeSet2);
        union.addAll(treeSet1);
        // Print the Union
        System.out.println("Union: " + union);

        // New TreeSet
        TreeSet<Integer> intersection = new TreeSet<>();
        intersection.addAll(treeSet1);
        intersection.retainAll(treeSet2);
        // Print the intersection
        System.out.println("Intersection: " + intersection);
    }
}