package Week2.Day1;
import java.util.Arrays;

public class ImportArrays {
    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={8,7,2,1,5};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,1));
        display(arr);
    }
}
