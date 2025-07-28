package day36_inheritance.shape;

public class Circle extends Shape {
    // Instance Var
    double radius;

    public Circle (double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area () {
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter (){
        return 2 * radius * 3.14;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}
