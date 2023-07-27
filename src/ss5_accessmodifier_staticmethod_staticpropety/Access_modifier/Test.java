package ss5_accessmodifier_staticmethod_staticpropety.Access_modifier;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea());

        Circle circle1 = new Circle();
        circle1.setRadius(2);
        circle1.setColor("yellow");
        System.out.println(circle1.getArea());
    }
}
