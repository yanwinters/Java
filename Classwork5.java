package Lection4;

import java.util.*;

public class Classwork5 {
    public static void main(String[] args) {
        String[] array1 = {"this", "is", "a", "string", "array"};
        Integer[] array2 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Double[] array3 = {3.4, 5.7, 8.2, 9.0, 11.6};
        Character[] array4 = {'c','h','a','r',' ','a','r','r','a','y'};

        HashSet<Integer> col1 = new HashSet<Integer>();
        col1.add(1);
        col1.add(2);
        col1.add(3);

        ArrayList<String> col2 = new ArrayList<String>();
        col2.add("First");
        col2.add("Second");
        col2.add("Third");

        Queue<Double> col3 = new LinkedList<Double>();
        col3.offer(3.5);
        col3.offer(7.7);
        col3.offer(10.2);

        printArray(array1);
        printArray(array2);
        printArray(array3);
        printArray(array4);

        printCollection(col1);
        printCollection(col2);
        printCollection(col3);
    }

    public static void printArray(Object[] ar) {
        System.out.println("Elements in array:");
        for (Object o : ar) {
            System.out.print(o+" ");
        }
        System.out.println("\n");
    }

    public static void printCollection(Collection col) {
        System.out.println("Elements in collection:");
        for (Object o : col) {
            System.out.print(o + " ");
        }
        System.out.println("\n");
    }
}
