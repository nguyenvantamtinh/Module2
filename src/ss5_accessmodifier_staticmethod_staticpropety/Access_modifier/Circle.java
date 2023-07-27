package ss5_accessmodifier_staticmethod_staticpropety.Access_modifier;

public class Circle {
    private double radius = 1;
    private String color = "red";
    public Circle(double radius ){
        this.radius = radius;
    }
    public Circle(){};

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
