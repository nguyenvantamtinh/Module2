package ss3_array_method.exercise;
// gộp mảng
import java.util.Arrays;
import java.util.Scanner;
public class gopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập kích thước mảng 1");
        int numElement1 = Integer.parseInt(scanner.nextLine());
        int[] arr1 = new int[numElement1];
        for (int i=0; i<arr1.length; i++){
            System.out.println("arr1[" + i+"]");
            arr1[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr1));


        System.out.println("nhập kích thước mảng 2");
        int numElement2 = Integer.parseInt(scanner.nextLine());
        int[] arr2 = new int[numElement2];
        for (int j=0; j<arr2.length; j++){
            System.out.println("arr2[" + j+"]");
            arr2[j] =  Integer.parseInt(scanner.nextLine());
        }

        int[] arr3 = new int[numElement1 + numElement2];
        for (int i=0; i<arr1.length; i++){
            arr3[i] =arr1[i];
        }
        for (int i=0; i<arr2.length;i++){
            arr3[arr1.length+i] =arr2[i];
        }
        System.out.println(Arrays.toString(arr3));











    }
}
