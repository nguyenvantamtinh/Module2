package ss3_array_method.exercise;
// tính tổng đường chéo chính
import java.util.Scanner;
public class sum_cheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số hàng");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập số cột");
        int columns = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[row][columns];
        System.out.println("nhập giá trị cho mảng");
        for (int i=0; i<row; i++){
            for (int j=0; j<columns; j++){
                System.out.println("nhập giá trị cho hàng " + i + " vị trí " + j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
        int sum = 0;

        // tính tổng đường chéo chính 1 vòng for
//        for (int i=0; i<arr.length; i++){
//            sum += arr[i][i];
//        }

        //tính tổng đường chéo chính 2 vòng for
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
               if(i==j){
                   sum += arr[i][j];
                   break;
               }
            }
        }
        System.out.println("tong duong cheo chinh là : " + sum);

    }
}
