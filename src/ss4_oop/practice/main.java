package ss4_oop.practice;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the width");
        double width = scanner.nextDouble();
        System.out.println("enter the height");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

    }
}
