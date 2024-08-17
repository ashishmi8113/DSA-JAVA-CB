package Week2;
import java.util.*;
public class AssignMent_2Sol {
	public static int binarySearch(int arr[], int M) {
        int low = 0, high = arr.length - 1, mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == M) {
                return mid;
            } else if (arr[mid] < M) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
	// public static void main(String args[]) {
	// 	//Q1
	// 	Scanner sc = new Scanner(System.in);
	// 	int N = sc.nextInt();
	// 	int arr[] = new int[N];

	// 	for(int i = 0; i<N; i++){
	// 		arr[i] = sc.nextInt();
	// 	}
	// 	int M = sc.nextInt();
	// 	System.out.println(binarySearch(arr, M));
        
    // }







	public static boolean isAllZero(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				return false;
			}
		}
		return true;
	}

    public static long countSubarraysWithSumK(int[] arr, int k) {
		boolean isAll0=isAllZero(arr);
		if(isAll0){
			long n=arr.length;
			return n*(n+1)/2;
		}
        long count = 0;
        int n = arr.length;
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                
                if (sum == k) {
                    count++;
                }
				else if(sum>k){
					break;
				}
            }


        }
        return count;
    }
    
    // public static void main(String[] args) {
	// // Q2
    //     Scanner sc = new Scanner(System.in);
    //     int N = sc.nextInt();
    //     int k = sc.nextInt();
    //     int[] arr = new int[N];
        
    //     for (int i = 0; i < N; i++) {
    //         arr[i] = sc.nextInt();
    //     }
        
    //     System.out.println(countSubarraysWithSumK(arr, k));
    //     sc.close();
    // }





	public static void interSectionArr(int[] arr1,int[] arr2){
		// Arrays.sort(arr1);
        // Arrays.sort(arr2);
		// int count=0;
		for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
			    if(arr2[i]==arr1[j]){
					System.out.print(arr2[i]+" ");
					arr1[j]=Integer.MIN_VALUE;
					break;
				}
            }
		}
	}
    // public static void main(String[] args) {
	// // Q3
    //     Scanner sc=new Scanner(System.in);
	// 	int N=sc.nextInt();
	// 	int[] arr=new int[N];

	// 	int N2=sc.nextInt();
	// 	int[] arr2=new int[N2];

	// 	for(int i=0;i<N;i++){
	// 		arr[i]=sc.nextInt();
	// 	}
	// 	for(int i=0;i<N2;i++){
	// 		arr2[i]=sc.nextInt();
	// 	}

	// 	interSectionArr(arr,arr2);
    //     sc.close();
    // }









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
    // public static void main (String args[]) {
	// // Q4
	// 	Scanner sc=new Scanner(System.in);
	// 	int n= sc.nextInt();
	// 	int[] arr=new int[n];
	// 	for(int i=0;i<n;i++){
	// 		arr[i]=sc.nextInt();
	// 	}
    //     insertionSort(arr);
    //     display(arr);
    // }









	// public static void display(int[] arr){
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
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
    // public static void main (String args[]) {
	// // Q5
	// 	Scanner sc=new Scanner(System.in);
	// 	int n= sc.nextInt();
	// 	int[] arr=new int[n];
	// 	for(int i=0;i<n;i++){
	// 		arr[i]=sc.nextInt();
	// 	}
    //     selectionSort(arr);
    //     display(arr);
    // }









	// public static void display(int[] arr){
    //     for (int i = 0; i < arr.length; i++) {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
	public static void bubbleSort(int[] arr){
        for (int turn = 1; turn < arr.length; turn++) {
            int flag=0;
            for (int i = 0; i < arr.length-turn; i++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                break;
            }
        }
    }
    // public static void main (String args[]) {
	// // Q6
	// 	Scanner sc=new Scanner(System.in);
	// 	int n= sc.nextInt();
	// 	int[] arr=new int[n];
	// 	for(int i=0;i<n;i++){
	// 		arr[i]=sc.nextInt();
	// 	}
    //     bubbleSort(arr);
    //     display(arr);
    // }
















	public static int numSubArrays(int[] arr,int k){
		int totalNumber=0;
		// int addi=0;
		for(int i=0;i<arr.length;i++){
		int prevSum=1;
            for(int j=i;j<arr.length;j++){
			    prevSum*=arr[j];
                if(prevSum<k){
                    totalNumber++;
                }
                else{
                    break;
                }
            }
		}
        return totalNumber;
	}
    // public static void main(String[] args) {
	// // Q7
    //     Scanner sc=new Scanner(System.in);
	// 	int N=sc.nextInt();
	// 	int k=sc.nextInt();
	// 	int[] arr=new int[N];
	// 	for(int i=0;i<N;i++){
	// 		arr[i]=sc.nextInt();
	// 	}
	// 	System.out.println(numSubArrays(arr,k));
    //     sc.close();
    // }













	public static int longestSubarray(int[] arr) {
        int left=0,maxLen=0,zeroCount=0;
        for(int right=0;right<arr.length;right++){
            if(arr[right]==0){
                zeroCount++;
            }
            while(zeroCount>=2){
                if(arr[left]==0){
                    zeroCount--;
                }
                left++;
            }
            maxLen=Math.max(maxLen,right-left);
        }
        return maxLen;
    }

    // public static void main(String[] args) {
	// //Q8
    //     Scanner sc = new Scanner(System.in);
    //     int N = sc.nextInt();
    //     int[] nums = new int[N];
    //     for (int i = 0; i < N; i++) {
    //         nums[i] = sc.nextInt();
    //     }
    //     System.out.println(longestSubarray(nums));
    //     sc.close();
    // }
















	public static int longestCommonSubarray(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[][] dp = new int[n1 + 1][n2 + 1];
        int maxLen = 0;

        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n2; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    maxLen = Math.max(maxLen, dp[i][j]);
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
	// Q 9
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();
        }
        int N2 = sc.nextInt();
        int[] arr2=new int[N2];
        for (int i = 0; i < N2; i++) {
            arr2[i]=sc.nextInt();
        }
        sc.close();
        int result = longestCommonSubarray(arr, arr2);
        System.out.println(result);
    }

}

