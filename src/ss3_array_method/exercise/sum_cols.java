package ss3_array_method.exercise;
// tổng các cột
import java.util.Scanner;
public class sum_cols {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập cột cần tính");
        int column = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i =0; i <arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if(j == column){
                    count += arr[i][j];
                }
            }
        }
        System.out.println(count);
    }
}