package ss3_array_method.practice;
// tìm giá trị lớn nhất trong mảng
public class maxValue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,5,4,8};
        int indexMax = max(arr);
        System.out.println("giá trị lớn nhất là : " + arr[indexMax]);

    }

    public static int max(int[] arr) {
        int index = 0;
        for (int i=0; i<arr.length; i++){
            if(arr[i] > arr[index]){
                index = i;
            }
        }
        return index;
    }
}
