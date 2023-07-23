package ss4_oop.exercise.stop_watch;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println("Enter any string:");
        (new Scanner(System.in)).nextLine();
        stopWatch.stop();
        System.out.println("Elapse time: " + stopWatch.elapseTime());
    }
}
