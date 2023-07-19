package ss3_array_method.exercise;
import java.util.Arrays;
import java.util.Scanner;
public class addElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số cần chèn");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vị trí cần chèn");
        int index = Integer.parseInt(scanner.nextLine());

        if(index<0 || index >= arr.length){
            System.out.println("không thể chèn phần tử");
        }else {
            arr = Arrays.copyOf(arr,arr.length+1);
            for (int i=arr.length-1; i>index; i--){
                arr[i] = arr[i-1];
            }
        }
        arr[index] = num;
        System.out.println("mảng sau khi chèn : ");
        System.out.println(Arrays.toString(arr));
    }
}
