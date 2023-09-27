package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double pi = 3.14;
        double area;

        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius of a circle:");
        radius = input.nextDouble();
        input.close();

        area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
    }
}
