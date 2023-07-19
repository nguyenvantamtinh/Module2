package ss3_array_method.exercise;
// kiểm tra số lần xuất hiện của ký tự
import  java.util.Scanner;
public class check_kytu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chuỗi ký tự");
        String string1 = scanner.nextLine();
        System.out.println("nhập 1 ký tự ");
        String string2 = scanner.nextLine();

        int count = 0;
        for (int i=0; i<string1.length(); i++){
            if(string1.charAt(i) == string2.charAt(0) ){
                count++;
            }
        }
        System.out.println("số lần xuất hiện của " + string2 + " là " + count);
    }
}
