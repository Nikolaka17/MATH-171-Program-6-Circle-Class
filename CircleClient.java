// Author: Nikolas Leslie
// Date created: 11/29/2022
// Last modified: 11/30/2022
// A program that tests the circle class

//import p1.Circle;
import java.util.ArrayList;
import java.util.Random;

class CircleClient {
  public static void main(String[] args) {
    Random rng = new Random();
    ArrayList<Circle> testCircles = new ArrayList<Circle>();
    testCircles.add(new Circle());
    testCircles.add(new Circle(1, new int[]{3, 5}));
    //testCircles.add(new Circle(0, new int[]{6, 3}));
    //testCircles.add(new Circle(4, new int[]{3, 4, 6}));
    testCircles.add(new Circle(5.3, 4, 5));
    testCircles.add(new Circle(0.5, new int[]{-4, 5}));
    testCircles.add(new Circle(1, 3, 5));

    for(int i = 0; i < testCircles.size(); i++){
      System.out.println("C"+(i+1)+" radius: " + testCircles.get(i).getRadius());
      System.out.println("C"+(i+1)+" cords: ("+testCircles.get(i).getCenter()[0]+", "+testCircles.get(i).getCenter()[1]+")");
      System.out.println("C"+(i+1)+" x: "+testCircles.get(i).getCenterX());
      System.out.println("C"+(i+1)+" y: "+testCircles.get(i).getCenterY());
    }

    System.out.println("C2 == C5: " + testCircles.get(1).equals(testCircles.get(4)));
    System.out.println("C3 == C4: " + testCircles.get(2).equals(testCircles.get(3)));

    for(int i = 0; i <testCircles.size(); i++){
      System.out.println("C"+(i+1)+" area: " + testCircles.get(i).area());
    }

    for(int i = 0; i < testCircles.size(); i++){
      System.out.println("C"+(i+1)+" circumference: " + testCircles.get(i).circumference());
    }

    //testCircles.get(0).setRadius(-3);
    //testCircles.get(0).setCenter(new int[]{3, 34, 5});
    for(int i = 0; i < testCircles.size(); i++){
      testCircles.get(i).setRadius(rng.nextInt(10)+1);
      testCircles.get(i).setCenter(new int[]{rng.nextInt(20)-10, rng.nextInt(20)-10});
      testCircles.get(i).setCenter(rng.nextInt(20)-10, rng.nextInt(20)-10);
      testCircles.get(i).setCenterX(rng.nextInt(20)-10);
      testCircles.get(i).setCenterY(rng.nextInt(20)-10);
      testCircles.get(i).shift(rng.nextInt(20)-10, rng.nextInt(20)-10);
      System.out.println("C"+(i+1)+" has been mutated");
    }

    for(int i = 0; i < testCircles.size(); i++){
      System.out.println("C"+(i+1)+": "+testCircles.get(i));
    }
    
  }
}
