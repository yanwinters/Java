package Lection4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Classwork3 {
    public static void main(String[] args) {
        Queue<Character> q = new LinkedList<Character>();
        Random r = new Random();
        for (int i=0; i < 10; i++) {
            q.offer((char) r.nextInt());
        }
        for (Character character : q) {
            System.out.println(character);
        }
    }
}
