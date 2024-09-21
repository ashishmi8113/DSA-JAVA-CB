package Week10.Day0;

public class QuickSortClass {

    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivote=arr[high];
        int i=low-1;
        for (int j = low; j <=high-1; j++) {
            if(arr[j]<pivote){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void quickSort(int[] arr,int low, int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    public static void main(String[] args) {
        int[] arr={5,6,1,2,10,15,0};
        int low=0;
        int high=arr.length-1;
        quickSort(arr, low, high);
        display(arr);
    }
}
