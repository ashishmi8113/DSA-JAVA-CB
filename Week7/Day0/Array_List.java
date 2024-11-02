import java.util.*;

public class Array_List {
    public static ArrayList<Integer> arrayList(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr={5,10,15,20,25,30,35,40};
        System.out.println(arrayList(arr));

        List<Integer> list=new ArrayList<>();
        list.add(555);
        System.out.println(list.get(0));
        
    }
}