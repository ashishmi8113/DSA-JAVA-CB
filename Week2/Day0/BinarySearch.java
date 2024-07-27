package Week2.Day0;

public class BinarySearch {
    public static int bs(int[] arr, int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>key){
                end=mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static int bsLowerBound(int[] arr, int key){
        int firstOccurence=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>key){
                end=mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                firstOccurence= mid;
                end=mid-1;
            }
        }
        return firstOccurence;
    }
    public static int bsUpperBound(int[] arr, int key){
        int upperBound=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>key){
                end=mid-1;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                upperBound= mid+1;
                start=mid+1;
            }
        }
        return upperBound;
    }
    public static int CountOccurence(int[] arr, int num){
        int lower=bsLowerBound(arr, num);
        int upper=bsUpperBound(arr, num);
        return upper-lower;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,2,5,6,7,8,8,8,8,8,8,9,10,10};
        int key=80;
        int first=bsLowerBound(arr, key);
        int upp=bsUpperBound(arr, key);
        System.out.println(first);
        System.out.println(upp);
        System.out.println(CountOccurence(arr,key));
    }
}
