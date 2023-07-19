package ss3_array_method.practice;
// tim gia tri nho nhat trong mang su dung method
public class minValue {
    public static void main(String[] args) {
        int[] arr = {4,12,7,8,2,6,9};
        int index = min(arr);
        System.out.println("phần tử nhỏ nhất trong mảng là " + arr[index]);
    }

    public static int min(int[] arr) {
        int index = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] < arr[index]){
                index = i;
            }
        }
        return index;
    }
}
