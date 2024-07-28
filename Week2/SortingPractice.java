package Week2;

import java.util.Arrays;

public class SortingPractice {
    public static void disp(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }



    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }





    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            // for (int j = i; j < arr.length; j++) {
                int idx=minimumValue(arr, i);
                int temp=arr[idx];
                arr[idx]=arr[i];
                arr[i]=temp;
            // }
        }
    }
    public static int minimumValue(int[] arr, int a){
        int mini=a;
        for (int i = a+1; i < arr.length; i++) {
            if(arr[mini]>arr[i]){
                mini=i;
            }
        }
        return mini;
    }




    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        System.out.println("Ashish Mishra");
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr,5));
        disp(arr);
    }
}
