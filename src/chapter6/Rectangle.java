package chapter6;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width){
        this.length = length; //Can be set this way
        setWidth(width); //or Can be set in this way, these two are here to demonstrate options
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    double calucateParimeter(){
        return (2*length)+(2*width);
    }

    double calculateArea(){
        return length*width;
    }
}
