
public class WrapperClass {
    public static void main(String[] args) {
        Integer a=10;
        int b=a; // UNBOXING
        System.out.println(b);

        int c=15;
        Integer d=c; //AUTOBOXING
        System.out.println(d);

        int[] arr={4,3,2,1};
        Array_List al=new Array_List();
        al.list(arr);
        

    }
}
