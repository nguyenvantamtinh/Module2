package ss2_loop.exercise;

public class CheckPrime {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = new int[20];
        for (int num=2; count <20; num++){
            boolean prime = true;
            for (int i=2 ; i<Math.sqrt(num); i++){
                if(num % i == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                arr[count] = num;
                count++;
            }
        }
        System.out.println(" 20 số nguyên tố đầu tiên là : ");
        for (int j=0; j<arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
