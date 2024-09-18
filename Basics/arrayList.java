package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList{

    public static void main(String[] args) {
        // Initialize ArrayList
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);
        arrList.add(5);

        // Display initial ArrayList
        System.out.println("Initial ArrayList: " + arrList);

        // Call the helper function to perform insertion and deletion
        modifyList(arrList);

        // Display final ArrayList after insertion and deletion
        System.out.println("Final ArrayList after insertion and deletion: " + arrList);
    }

    // Helper function for insertion and deletion
    public static void modifyList(ArrayList<Integer> arrList) {
        Scanner sc = new Scanner(System.in);

        // Insertion
        System.out.print("Enter the position to insert an element: ");
        int insertPos = sc.nextInt();
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();

        // Perform the insertion at the specified position
        if (insertPos >= 0 && insertPos <= arrList.size()) {
            arrList.add(insertPos, element);
            System.out.println("ArrayList after insertion: " + arrList);
        } else {
            System.out.println("Invalid insertion position!");
        }

        // Deletion
        System.out.print("Enter the position to delete an element: ");
        int deletePos = sc.nextInt();

        // Perform the deletion at the specified position
        if (deletePos >= 0 && deletePos < arrList.size()) {
            arrList.remove(deletePos);
            System.out.println("ArrayList after deletion: " + arrList);
        } else {
            System.out.println("Invalid deletion position!");
        }

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
