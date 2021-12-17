package Lection4;

import java.util.*;

public class Classwork2 {
    private final static String aboutJava = "Java is a programming language that is concurrent, " +
            "classbased and object-oriented.";

    public static void main(String[] args) {
        StringTokenizer st= new StringTokenizer(aboutJava, "., ");
        SortedSet<String> words = new TreeSet<String>();
        while (st.hasMoreTokens()) {
            words.add(st.nextToken());
        }
        Iterator<String> i = words.iterator();
        while (i.hasNext()) {
            String s = i.next();
            if (s.length() <= 3) {
                i.remove();
                words.remove(s);
            }
        }

        i= words.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
