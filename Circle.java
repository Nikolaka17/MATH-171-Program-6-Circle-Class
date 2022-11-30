// Author: Nikolas Leslie
// Date created: 11/29/2022
// Last modified: 11/30/2022
// A class made to hold a circle

//package p1;
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

  public void setRadius(int r)throws IllegalArgumentException{
    if(!(r > 0)){
      throw new IllegalArgumentException("Radius must be greater than 0");
    }
    radius = r;
  }

  public void setCenter(int[] c)throws IllegalArgumentException{
    if(c.length != 2){
      throw new IllegalArgumentException("Array must only contain 2 values, the x-cord and y-cord");
    }
    center = c;
  }

  public void setCenter(int x, int y){
    center[0] = x;
    center[1] = y;
  }

  public void setCenterX(int x){
    center[0] = x;
  }

  public void setCenterY(int y){
    center[1] = y;
  }

  public boolean areCongruent(Circle c){
    return c.radius == radius;
  }

  public double area(){
    return Math.PI * radius * radius;
  }

  public double circumference(){
    return Math.PI * radius * 2;
  }

  public void shift(int x, int y){
    center[0] += x;
    center[1] += y;
  }

  @Override
  public String toString(){
    return "Circle at (" + center[0] + ", " +center[1]+") with a radius of " + radius;
  }

  @Override
  public boolean equals(Object o){
    return radius == ((Circle) o).radius && center[0] == ((Circle) o).center[0] && center[1] == ((Circle) o).center[1];
  }

}
