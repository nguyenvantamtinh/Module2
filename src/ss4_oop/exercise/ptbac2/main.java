package ss4_oop.exercise.ptbac2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println(" enter a");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println(" enter b");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println(" enter c");
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if(delta > 0){
            double x1 = (-b + Math.sqrt(delta)) / 2*a;
            double x2 = (b - Math.sqrt(delta)) / 2*a;
            System.out.println("2 nghiệm phân biệt" +x1 +" và "+ x2);
        }else if(delta == 0){
            double x = -b / a*2;
            System.out.println("nghiệm kép" + x);
        }else {
            System.out.println("pt vô nghiệm");
        }
    }
}
