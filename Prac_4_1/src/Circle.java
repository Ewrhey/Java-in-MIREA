public class Circle extends Shape{
    public float radius;
//    public Circle(String type, float area, float perimeter, float radius) {
//        super(type, area, perimeter);
//        this.radius = radius;
//    }
    public Circle(float radius){
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    @Override
    public float getArea() {
        return (float) (3.14 * radius * radius);
    }

    @Override
    public float getPerimeter() {
        return (float) (3.14 * radius * 2);
    }

    @Override
    public String getType(){
        return "Circle";
    }

    @Override
    public String toString(){
        return "Circle\nRadius: " + getRadius() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
