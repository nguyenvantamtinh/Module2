package ss2_loop.practice;

import java.util.Scanner;

public class Check_Student {
    public static void main(String[] args) {
        String[] arr = {"yoe","nami","thor"};
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter a student");
        String check = scanner.nextLine();
        for (int i=0; i<arr.length; i++){
            if(arr[i].equals(check)){ // equals de so sanh chuoi
                System.out.println(arr[i] +" vi tri " +i);
            }
        }
    }
}
