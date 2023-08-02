package ss7_abstract_interface.exercise.interface_of_resizeble;

public class Circle extends Shape {
    private double radius;
    public Circle(){
        radius = 1;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(String color, double radius) {
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
        // dien tich
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        //chu vi
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                "color = " + getColor() +
                '}';
    }

    public void resize(double percent){
        double tmp = radius * percent / 100;
        radius += tmp;
    }


}
