package ss9_stack_queue.exercise.reverse_element_in_stack;

import java.util.Scanner;
import java.util.Stack;

public class ReversesNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("nhập số lượng phần tử của mảng");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i=0 ;i<n; i++){
            System.out.println("index + " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
       for (int i=0; i<arr.length; i++){
           stack.push(arr[i]);
       }

       for (int i=0; i<arr.length; i++){
           arr[i] = stack.pop();
       }

        System.out.println("mảng sau khí đảo ngược");
       for (int i=0; i<arr.length; i++){
           System.out.print(arr[i]+ " ");
       }
    }

}
