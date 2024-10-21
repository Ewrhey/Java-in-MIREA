public class Square extends Shape{
    public float side;
//    public Square(String type, float area, float perimeter, float side) {
//        super(type, area, perimeter);
//        this.side = side;
//    }

    public Square (float side) {
        this.side = side;
    }

    public float getSide(){
        return side;
    }

    @Override
    public float getArea() {
        return (float) (side * side);
    }

    @Override
    public float getPerimeter() {
        return (float) (side * 4);
    }

    @Override
    public String getType(){
        return "Square";
    }

    @Override
    public String toString(){
        return "Square\nSide: " + getSide() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
