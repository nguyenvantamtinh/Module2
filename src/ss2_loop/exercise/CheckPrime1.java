package ss2_loop.exercise;

public class CheckPrime1 {
    public static void main(String[] args) {
        int[] arr = new int[25];
        int count = 0;
        for (int i=2; i<100; i++){
            boolean prime = true;
            for (int j=2; j<=Math.sqrt(i); j++){
                if(i % j == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                arr[count] = i;
                count++;
            }
        }
        System.out.println("các số nguyên tố nhỏ hơn 100 là : ");
        for (int k=0; k<arr.length; k++){
            System.out.print(arr[k] +" ");
        }
    }
}
