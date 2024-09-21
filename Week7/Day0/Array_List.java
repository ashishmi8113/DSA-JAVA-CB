import java.util.ArrayList;

public class Array_List {
    public ArrayList<Integer> list(int[] arr){
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            al.add(arr[i]);
        }
        return al;
    }
    public static void main(String[] args) {
        
    }
}