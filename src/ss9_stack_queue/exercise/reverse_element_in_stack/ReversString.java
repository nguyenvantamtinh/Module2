package ss9_stack_queue.exercise.reverse_element_in_stack;

import java.util.Scanner;
import java.util.Stack;

public class ReversString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        System.out.println("nhập 1 chuỗi");
        String chuoi = sc.nextLine();
       for (int i=0; i<chuoi.length(); i++){
           stack.push(chuoi.charAt(i) +"");
       }

        System.out.println("chuỗi đao ngược");
       for (int j=0; j<chuoi.length(); j++){
           System.out.print(stack.pop());

       }
    }
}
