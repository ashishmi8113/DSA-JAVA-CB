package Week10.Day0;

public class MergeSortClass {
    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void merge(int[] arr, int low, int mid, int high){
        int size=high-low+1;
        int[] temp=new int[size];
        int i=mid;
        int j=high;
        int k=size-1;
        while (i>=low && j>=mid+1) {
            if(arr[i]>arr[j]){
                temp[k]=arr[i];
                i--;
            }
            else{
                temp[k]=arr[j];
                j--;
            }
            k--;
        }
        while(i>=low){
            temp[k]=arr[i];
            i--;
            k--;
        }
        while(j>=mid+1){
            temp[k]=arr[j];
            j--;
            k--;
        }
        for (int x = low; x <= high; x++) {
            arr[x]=temp[x-low];
        }
    }
    public static void mergesort(int[] arr,int low, int high){
        if(low<high){
            int mid=low+(high-low)/2;
            mergesort(arr,low,mid);
            mergesort(arr,mid+1,high);
            merge(arr, low, mid, high);
        }
    }
    
    public static void main(String[] args) {
        int[] arr={5,6,1,2,10,15,0};
        int low=0;
        int high=arr.length-1;
        mergesort(arr, low, high);
        display(arr);
    }
}
