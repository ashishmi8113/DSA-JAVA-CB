package Week2.Day1;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int index=miniValue(arr, i);
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
    }
    public static int miniValue(int[] arr, int a){
        int mini=a;
        for (int i = a+1; i < arr.length; i++) {
            if(arr[mini]>arr[i]){
                mini=i;
            }
        }
        return mini;
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
