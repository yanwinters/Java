package Lection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Classwork4 {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("Peter", 18);
        m.put("Charlie", 20);
        m.put("Nick", 19);
        m.put("Sara", 22);
        m.put("Jack", 18);
        m.put("Rose", 21);

        System.out.println("Keys:");
        for (String key: m.keySet()) {
            System.out.println(key);
        }
        System.out.println("\nValues:");
        for (int value: m.values()) {
            System.out.println(value);
        }

        System.out.println("Enter the key to search value:");
        Scanner in = new Scanner(System.in);
        String key = in.next();
        if (m.containsKey(key)) {
            System.out.println(key+" - "+m.get(key));
        }
        else {
            System.out.println("Key "+key+" not found");
        }

        System.out.println("Enter the value to search key(s):");
        int value = in.nextInt();
        if (m.containsValue(value)) {
            for (Map.Entry<String, Integer> e : m.entrySet()) {
                if (e.getValue() == value) {
                    System.out.println(e.getKey()+" - "+e.getValue());
                }
            }
        }
        else {
            System.out.println("Value "+value+" not found");
        }
    }
}
