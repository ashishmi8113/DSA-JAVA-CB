package Week3.Day1;

public class Nse_Nge {
    public static int[] ngel(int[] arr){
        int max=0;
        int[] ngel=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
                ngel[i]=max;
                max=Math.max(max,arr[i]);
        }
        return ngel;
    }
    public static int[] nser(int[] arr){
        int max=Integer.MAX_VALUE;
        int[] nser=new int[arr.length];
        for (int i = arr.length-1; i >=0; i--) {
                nser[i]=max;
                max=Math.min(max,arr[i]);
        }
        return nser;
    }
    public static int[] nsel(int[] arr){
        int min=Integer.MAX_VALUE;
        int[] nsel=new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
                nsel[i]=min;
                min=Math.min(min,arr[i]);
        }
        return nsel;
    }
    public static void main(String[] args) {
        int[] arr={3,7,2,5,8,4,9,1,6};
        int[] arr1= ngel(arr);
        int[] arr2= nser(arr);
        int[] arr3= nsel(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
    }
}
