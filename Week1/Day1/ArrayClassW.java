package Week1.Day1;
public class ArrayClassW {
    public static void printArr(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static int sumArr(int[] arr,int a,int b){
        int sum=0;
        if(a>b||a<0||b<0||b>=arr.length)
            return 0;
        for (int i = a; i <=b; i++) {
            sum+=arr[i];
        }
        return sum;
    }


    public static void printInReverseOrder(int[] arr){
        for (int i = arr.length-1; i >=0; --i) {
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
    public static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverseArrSirWay(int[] arr,int a, int b){
        for (int i = a, j = b; i <j; i++,j--) {
            swap(arr, i, j);
        }
        printArr(arr);
    }

    public static int lSearching(int[] arr, int a){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==a){
                return i;
            }
        }
        return -1;
    }
    public static boolean bSearchingBool(int[] arr, int a,int x, int y){
        int start=x;
        int end=y;
        while(start<=end){
            int mid=(start+end)/2;
            if(a>arr[mid]){
                start=mid+1;
            }
            else if(a<arr[mid]){
                end=mid-1;
            }
            else{
                return true;
            }

        }
        return false;
    }
    public static int bSearching(int[] arr, int a){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a>arr[mid]){
                start=mid+1;
            }
            else if(a<arr[mid]){
                end=mid-1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        // System.out.println(sumArr(arr,1,3));

        // printArr(arr);

        // reverseArr(arr);
        // reverseArrSirWay(arr,2,4);
        printArr(arr);
        System.out.println(bSearchingBool(arr, 2,2,4));
        // System.out.println(bSearching(arr, 5));

        // printInReverseOrder(arr);
        
        // printArr(arr);
    }
}
