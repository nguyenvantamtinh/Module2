package ss1_Introduction.exercise;

import java.util.Scanner;

public class Chuyendoitien {
    public static void main(String[] args) {
        double Vnd = 23000;
        double Usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter USD:  ");
        System.out.println(Double.parseDouble(scanner.nextLine()) * Vnd + " Vnd");
    }
}
