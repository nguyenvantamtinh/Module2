package ss3_array_method.exercise;
// xoá phần tử khỏi mảng
import java.util.Arrays;
import java.util.Scanner;
public class delete_Element {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập phần tử cần xoá");
        int element = Integer.parseInt(scanner.nextLine());
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("phần tử không tồn tại trong mảng");
            return;
        }

        for (int j=index; j<arr.length -1; j++){
            arr[j] = arr[j+1];
        }
        arr = Arrays.copyOf(arr,arr.length);

        arr[arr.length-1] = 0;

        System.out.println("mảng sau khi xoá :");
        System.out.println(Arrays.toString(arr));
    }

}



