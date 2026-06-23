interface task {

   double calculateArea(); 
}
class Rectangle implements task {
    public double length;
    public double width;

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea(){
        return length * width;
    }
}

class Circle implements task {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class AreaCalculator {
    public double calculateTotalArea(task[] shapes) {
        double totalArea = 0;

        for (task shape : shapes) {
            totalArea += shape.calculateArea();
        }

        return totalArea;
    }
}

public class Main1 {
    public static void main(String[] args) {
        task[] shapes = {
            new Rectangle(10, 05),
            new Circle(7)
        };
        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Total Area: " + calculator.calculateTotalArea(shapes));
    }
}

