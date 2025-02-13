package list_interface.problem;

import java.util.*;
import java.util.List;

/*Reverse a List
Write a program to reverse the elements of a given List without using built-in reverse methods. Implement it for both ArrayList and LinkedList.
Example:
Input: [1, 2, 3, 4, 5] → Output: [5, 4, 3, 2, 1].*/
public class Reverse {
        // Method to reverse an ArrayList without using built-in reverse methods
        public static <T> void reverseArrayList(ArrayList<T> list) {
            int left = 0, right = list.size() - 1;
            while (left < right) {
                // Swap elements
                T temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
                left++;
                right--;
            }
        }

        // Method to reverse a LinkedList without using built-in reverse methods
        public static <T> void reverseLinkedList(LinkedList<T> list) {
            int left = 0, right = list.size() - 1;
            while (left < right) {
                // Swap elements
                T temp = list.get(left);
                list.set(left, list.get(right));
                list.set(right, temp);
                left++;
                right--;
            }
        }

        public static void main(String[] args) {
            ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

            System.out.println("Original ArrayList: " + arrayList);
            reverseArrayList(arrayList);
            System.out.println("Reversed ArrayList: " + arrayList);

            System.out.println("Original LinkedList: " + linkedList);
            reverseLinkedList(linkedList);
            System.out.println("Reversed LinkedList: " + linkedList);
        }
    }
