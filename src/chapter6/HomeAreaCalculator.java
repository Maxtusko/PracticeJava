package chapter6;

/*
Write a class that creates instances of the Rectangle class to find
the total area of two rooms in a house.
 */

public class HomeAreaCalculator {

    public static void main(String args[]) {
        /*
         **** RECTANGLE 1
         */
        //Create instance of Rectangle class
        Rectangle room1 = new Rectangle();
        room1.setWidth(5);
        room1.setLength(10);
        double areaOfRoom1 = room1.calculateArea();
        double parimeterOfRoom1 = room1.calucateParimeter();

        System.out.println("The area of the 1st room is: " + areaOfRoom1);

        /*
         **** RECTANGLE 2
         */
        //Create instance of Rectangle class
        Rectangle room2 = new Rectangle(3, 4);

        double areaOfRoom2 = room2.calucateParimeter();

        System.out.println("The area of the 2nd room is: " + areaOfRoom2);

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("The area of both rooms is: " + totalArea);
    }
}