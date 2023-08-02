package ss7_abstract_interface.exercise.interface_colorabble;

public class Circle extends Shape{
    private double radius;

   public Circle(){
       radius = 1;
   };
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
