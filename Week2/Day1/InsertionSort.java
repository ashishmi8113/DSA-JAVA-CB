package Week2.Day1;

import java.util.Scanner;

public class InsertionSort {
    public static void display(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
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
        Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
        sc.close();
        insertionSort(arr);
        display(arr);

    }
}
