package ss6_kethua.circle_cylinder;

public class test {
    public static void main(String[] args) {
        Circle circle = new Circle(4,"red");
        System.out.println(circle.toString());

        Cylinder cylinder = new Cylinder(5,"blue",8);
        System.out.println(cylinder.toString());

    }
}
