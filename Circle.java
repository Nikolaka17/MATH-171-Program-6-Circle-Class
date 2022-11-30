// Author: Nikolas Leslie
// Date created: 11/29/2022
// Last modified: 11/30/2022
// A class made to hold a circle

//package p1;
/**
 * A class that is able to represent a circle
 */
public class Circle{
  private double radius;
  private int[] center;

  /**
   * Default constructor which initiates the radius to 1 and center to (0,0)
   */
  public Circle(){
    this(1, new int[]{0, 0});
  }

  /**
   * Main constructor that others call
   * @param r The value that radius is set to, must be greater than 0
   * @param c The array of 2 values, representing the x-cord and y-cord, that center is set to
   * @throws IllegalArgumentException Thrown if r isn't greater than 0 or c doesn't have exactly 2 values
   */
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

  /**
   * A constructor with seperated cordinates
   * @param r
   * @param x
   * @param y
   * @exception IllegalArugmentException Thrown if r isn't greater than 0
   */
  public Circle(double r, int x, int y){
    this(r, new int[]{x, y});
  }

  /**
   * Accessor for radius instance variable
   * @return The value recorded in the private instance variable 'radius'
   */
  public double getRadius(){
    return radius;
  }

  /**
   * Accessor for center instance variable
   * @return The value recorded in the private instance variable 'center'
   */
  public int[] getCenter(){
    return center;
  }

  /**
   * Accessor for the x-cord, first value, stored in center
   * @return The value recorded in the first position of the private instance variable 'center,' which corrosponds to the x-cord
   */
  public int getCenterX(){
    return center[0];
  }

  /**
   * Accessor for the y-cord, second value, stored in center
   * @return The value recorded in the second position of the private instance variable 'center,' which corrosponds to the y-cord
   */
  public int getCenterY(){
    return center[1];
  }

  /**
   * Mutator for the private instance variable 'radius'
   * @param r Value to change radius to
   * @throws IllegalArgumentException Thrown if r isn't greater than 0
   */
  public void setRadius(int r)throws IllegalArgumentException{
    if(!(r > 0)){
      throw new IllegalArgumentException("Radius must be greater than 0");
    }
    radius = r;
  }

  /**
   * Mutator for the private instance variable 'center'
   * @param c Array of 2 elements to change center to
   * @throws IllegalArgumentException Thrown if c doesn't contain exactly 2 elements
   */
  public void setCenter(int[] c)throws IllegalArgumentException{
    if(c.length != 2){
      throw new IllegalArgumentException("Array must only contain 2 values, the x-cord and y-cord");
    }
    center = c;
  }

  /**
   * Mutator for the private instance variable 'center'
   * @param x Value for the first position, x-cord, of center to be set to
   * @param y Value for the second position, y-cord, of center to be set to
   */
  public void setCenter(int x, int y){
    center[0] = x;
    center[1] = y;
  }

  /**
   * Mutator for the first value of the private instance variable 'center'
   * @param x Value for the first position, x-cord, of center to be set to
   */
  public void setCenterX(int x){
    center[0] = x;
  }

  /**
   * Mutator for the second value of the private instance variable 'center'
   * @param y Value for the second position, y-cord, of center to be set to
   */
  public void setCenterY(int y){
    center[1] = y;
  }

  /**
   * Finds if the circle is congruent to a given circle
   * @param c Circle to compare to
   * @return Boolean representing if the circles are congruent
   */
  public boolean areCongruent(Circle c){
    return c.radius == radius;
  }

  /**
   * Finds the area of the circle
   * @return A double representation of the area of the circle
   */
  public double area(){
    return Math.PI * radius * radius;
  }

  /**
   * Finds the circumference of the circle
   * @return A double representation of the circumference of the circle
   */
  public double circumference(){
    return Math.PI * radius * 2;
  }

  /**
   * Shifts the circle over a certain length on the x-axis and y-axis
   * @param x Amount to shift the x-axis by
   * @param y Amount to shift the y-axis by
   */
  public void shift(int x, int y){
    center[0] += x;
    center[1] += y;
  }

  /**
   * An overriden version of the toString method
   * @return A string representing the circle
   */
  @Override
  public String toString(){
    return "Circle at (" + center[0] + ", " +center[1]+") with a radius of " + radius;
  }

  /**
   * An overriden version of the equals method, comparing the radius and center
   * @param o A circle to compare against
   * @return A boolean representing if the circle is equivelent to a given circle
   */
  @Override
  public boolean equals(Object o){
    return radius == ((Circle) o).radius && center[0] == ((Circle) o).center[0] && center[1] == ((Circle) o).center[1];
  }
}
