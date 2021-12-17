package Lection4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Map<String, Planet> planetMap = new HashMap<String, Planet>();
        planetMap.put("Earth", new Planet(1000000.0, 6400.0, 4000.0));
        planetMap.put("Mercury", new Planet(50000.0, 3000.0, 400.0));
        planetMap.put("Venus", new Planet(70000.0, 4000.0, 1200.0));

        System.out.println("Enter planet name:");
        Scanner in = new Scanner(System.in);
        String key = in.next();
        if(planetMap.containsKey(key)) {
            System.out.println("distance to sun: "+planetMap.get(key).getDistanceToSun() +
                    "\nmass: "+ planetMap.get(key).getMass() +
                    "\ndiameter: "+planetMap.get(key).getDiameter());
        } else {
            System.out.println("Planet "+key+" not found");
        }
    }
}

class Planet {
    private Double distanceToSun;
    private Double mass;
    private Double diameter;

    public Planet(Double distanceToSun, Double mass, Double diameter) {
        this.distanceToSun = distanceToSun;
        this.mass = mass;
        this.diameter = diameter;
    }

    public Double getDistanceToSun() {
        return distanceToSun;
    }

    public void setDistanceToSun(Double distanceToSun) {
        this.distanceToSun = distanceToSun;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public Double getDiameter() {
        return diameter;
    }

    public void setDiameter(Double diameter) {
        this.diameter = diameter;
    }
}
