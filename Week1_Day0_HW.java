public class Week1_Day0_HW {
    public static void printArr(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static int sumArr(int[] arr){
        int sum=0;
        for (int i = 0; i <arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static void printInReverseOrder(int[] arr){
        for (int i = arr.length-1; i >=0; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void reverseArr(int[] arr){
        for (int i = 0; i <arr.length/2; i++) {
            int temp=arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i];
            arr[i]=temp;
        }
        printArr(arr);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(sumArr(arr));

        printArr(arr);

        reverseArr(arr);

        printInReverseOrder(arr);
        
        printArr(arr);
    }
}