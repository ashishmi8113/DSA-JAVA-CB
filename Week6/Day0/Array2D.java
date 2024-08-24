package Week6.Day0;
import java.util.Arrays;

public class Array2D {
    public static void populateArr(int[][] arr){
        int n=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=n;
                n++;
            }
        }

    }


    public static void display2D(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }



    public static void display1D(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    public static int sumArr(int[][] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum+=arr[i][j];
            }
        }
        return sum;
    }


    public static int[] linearSearch(int[][] arr,int key){
        int[] result=new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]==key){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }


    public static int[][] transpose(int[][] arr){
        int[][] result=new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                result[j][i]=arr[i][j];
            }
        }
        return result;
    }


    public static void transposeInSameArr(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr[0].length; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }


    public static void sortByRow(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
    }


    public static void sortByCol(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr,(a,b)->Integer.compare(a[0], b[0]));
        }
    }



    public static void sortArrCOMPLETE(int[][] arr){
        int[] nums=flaten(arr);
        Arrays.sort(nums);
        fill2D(nums, arr);
    }
    public static int[] flaten(int[][] nums){
        int rowSize=nums.length;
        int colSize=nums[0].length;
        int[] arr=new int[rowSize*colSize];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                arr[colSize*i+j]=nums[i][j];
            }
        }
        return arr;
    }
    public static void fill2D(int[] arr, int[][] nums){
        int colSize=nums[0].length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nums[i][j]=arr[colSize*i+j];
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums={
            {7,8,9},
            {1,10,3},
            {5,20,13}
        };
        // populateArr(nums);
        
        display2D(nums);
        int sum=sumArr(nums);
        System.out.println(sum);
        int[] ans=linearSearch(nums, 10);
        display1D(ans);

        int[][] transposeArr=transpose(nums);
        display2D(transposeArr);
        
        transposeInSameArr(nums);
        display2D(nums);

        sortArrCOMPLETE(nums);
        display2D(nums);
    }
}
