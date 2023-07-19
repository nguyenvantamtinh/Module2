package ss2_loop.practice;
// đảo ngược mảng
import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        int size = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("enter a numbers of element");
            size = Integer.parseInt(scanner.nextLine());
            if(size > 20){
                System.out.println("Size do not exceed 20 ");
            }
        }while (size > 20);
        int[] array = new int[size];
        for (int i=0; i<array.length; i++){
            System.out.println("enter element  " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int j=0; j<array.length/2; j++){
            int temp = array[j];
            array[j] = array[array.length - j -1];
            array[array.length - j - 1] = temp;
        }

        System.out.println(" Array reverse : ");
        System.out.println(Arrays.toString(array));
//        for (int k=0; k < array.length; k++){
//            System.out.print(array[k] + " ");
//        }
    }
}
