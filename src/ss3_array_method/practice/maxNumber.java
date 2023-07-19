package ss3_array_method.practice;
// tìm giá trị lớn nhất trong mảng
import java.util.Scanner;

public class maxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i=0; i<arr.length; i++){
            System.out.println("arr" + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int index = maxValue(arr);
        System.out.println("giá trị lớn nhất trong mảng là : " + arr[index]);
    }

    public static int maxValue(int[] arr) {
        int index = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] > arr[index]){
                index = i;
            }
        }
        return index;
    }
}

