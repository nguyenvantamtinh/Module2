package ss3_array_method.exercise;
// tìm phần tử nhỏ nhất trong mảng
import java.util.Scanner;

public class element_Min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("numbers of element");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i=0; i<arr.length; i++){
            System.out.println("arr" + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int index = numberMin(arr);
        System.out.println(" element min of array : " + arr[index]);

    }

    public static int numberMin(int[] arr) {
        int index = 0;
        for (int j=0; j<arr.length; j++){
            if(arr[j] < arr[0]){
                index = j;
            }
        }
        return index;
    }
}
