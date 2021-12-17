package Lection4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> planetMap = new HashMap<String, ArrayList<Integer>>();
        ArrayList<Integer> pl = new ArrayList<Integer>();
        pl.add(12);
        pl.add(1200);
        pl.add(3400);
        planetMap.put("Earth", pl);
        ArrayList<Integer> pl2 = new ArrayList<Integer>();
        pl2.add(4000);
        pl2.add(450);
        pl2.add(2000);
        planetMap.put("Mercury", pl2);
        ArrayList<Integer> pl3 = new ArrayList<Integer>();
        pl3.add(2500);
        pl3.add(6000);
        pl3.add(1000);
        planetMap.put("Venus", pl3);

        System.out.println("Enter planet name:");
        Scanner in = new Scanner(System.in);
        String key = in.next();
        if(planetMap.containsKey(key)) {
            System.out.println("distance to sun: "+planetMap.get(key).get(0) +
                    "\nmass: "+ planetMap.get(key).get(1) +
                    "\ndiameter: "+planetMap.get(key).get(2));
        } else {
            System.out.println("Planet "+key+" not found");
        }
    }
}
