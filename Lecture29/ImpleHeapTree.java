package Lecture29;

public class ImpleHeapTree {
    public static void main(String[] args) {
        int[] arr={10,20,30,1,5,7,3,2};
        HeapTreeeClass hp=new HeapTreeeClass(arr);
        hp.display();
        hp.add(-1);
        hp.display();
        int rv=hp.remove();
        hp.display();
        System.out.println(rv);
    }
}
