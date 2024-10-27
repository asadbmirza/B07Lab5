package B07Lab5;

import B07Lab5.Point;

public class Circle {
  double radius;
  Point center;

  public Circle(double radius, Point center) {
    this.radius = radius;
    this.center = center;
  }

  public double area() {
    return Math.PI * radius * radius;
  }

  public double circumference() {
    return 2 * Math.PI * radius;
  }

  @Override
  public int hashCode() {
    return (int) (3 * radius + 5 * center.x + 7 * center.y);
  }
  
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Circle other = (Circle) obj;

    return this.radius == other.radius && this.center.equals(other.center);
  }
}