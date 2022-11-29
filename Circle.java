package p1;
public class Circle{
  private double radius;
  private int[] center;

  public Circle(){
    this(1, new int[]{0, 0});
  }

  public Circle(double r, int[] c)throws IllegalArgumentException{
	if(!(r > 0)){
		throw new IllegalArgumentException("Radius must be greater than 0");
	}
    if(c.length != 2){
      throw new IllegalArgumentException("Array must only contain 2 values, the x-cord and y-cord");
    }

    radius = r;
    center = c;
  }

  public Circle(double r, int x, int y){
    this(r, new int[]{x, y});
  }

  public double getRadius(){
    return radius;
  }

  public int[] getCenter(){
    return center;
  }

  public int getCenterX(){
    return center[0];
  }

  public int getCenterY(){
    return center[1];
  }
}
