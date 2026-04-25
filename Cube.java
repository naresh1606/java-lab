package shapes;
/**
 * Cube class extends Square
 * Demonstrates use of super() and super.area()
 */
public class Cube extends Square {
 /**
  * Constructor calls Square constructor
  * @param s side length
  */
 public Cube(double s) {
 super(s);
 }
 /**
  * Calculate surface area of cube
  * Uses one face area from Square
  * @return surface area
  */
 public double area() {
 double tmp = super.area(); 
 return 6 * tmp;
 }
 /**
  * Calculate cube volume
  * @return volume
  */
 public double volume() {
 return side * side * side;
 }
}
