public class Rectangle extends Shape {
    public float length;
    public float width;

//    public Rectangle(String type, float area, float perimeter, float length, float width) {
//        super(type, area, perimeter);
//        this.length = length;
//        this.width = width;
//    }
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }


    @Override
    public float getArea() {
        return (float) (length * width);
    }

    @Override
    public float getPerimeter() {
        return (float) (length * 2 + width * 2);
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return "Rectangle\nLength: " + getLength() + "\nWidth: " + getWidth()
                + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
