package ss9_stack_queue.exercise.nhiphan;

import java.util.Scanner;
import java.util.Stack;

public class ChangeBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("enter a decimal");
        int x = Integer.parseInt(sc.nextLine());

        for (int i=0; x>0; i++){
                int sodu = x % 2;
                stack.push(sodu);
                x = x / 2;
        }

        System.out.println("binary : ");
        int n = stack.size();
        for (int j=0; j<n; j++){
            System.out.print(stack.pop() + " ");
        }
    }
}
