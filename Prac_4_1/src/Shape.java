public class Shape {
private String type;
private float area;
private float perimeter;

protected Shape () {}

public Shape (String type, float area, float perimeter){
    this.type = type;
    this.area = area;
    this.perimeter = perimeter;
}


    public String getType() {
        return type;
    }

    public float getArea() {
        return area;
    }

    public float getPerimeter() {
        return perimeter;
    }

    @Override
    public String toString() {
        return "Shape: " + getType() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
