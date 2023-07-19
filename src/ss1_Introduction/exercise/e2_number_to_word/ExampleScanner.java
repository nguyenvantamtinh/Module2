package ss1_Introduction.exercise.e2_number_to_word;

import java.util.Scanner;

public class ExampleScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter your weight in kilograms: ");
        double weight = Double.parseDouble(scanner.nextLine());

        System.out.println("Hello, " + name + "! You are " + age + " years old and weigh " + weight + " kilograms.");
    }
}
