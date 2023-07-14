package chapter6;

public class Rectangle {
    private double length; //outside thisclass cannot excess if here is private

    // if there is protected other class of same package can have access
   private double width;   //outside thisclass cannot excess if here is private

    public Rectangle(){
        length=0;
        width=0;

    }

    public Rectangle( double length, double width){
        this.length = length;
        this.width = width; //can be set setWidth(width);


    }

   public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length= length;
    }

   public double getWidth(){
        return width;
    }

    public void  setWidth(double width){
        this.width= width;

    }

    public double calculatePerimeter(){
        return (2* length) + (2*width);

    }

    public double calculateArea(){
        return length * width;


    }
}
