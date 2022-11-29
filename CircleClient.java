import p1.Circle;
import java.util.ArrayList;

class CircleClient {
  public static void main(String[] args) {
    ArrayList<Circle> testCircles = new ArrayList<Circle>();
    testCircles.add(new Circle());
    testCircles.add(new Circle(1, new int[]{3, 5}));
    //testCircles.add(new Circle(0, new int[]{6, 3}));
    //testCircles.add(new Circle(4, new int[]{3, 4, 6}));
    testCircles.add(new Circle(5.3, 4, 5));
    testCircles.add(new Circle(0.5, new int[]{-4, 5}));
    
  }
}
