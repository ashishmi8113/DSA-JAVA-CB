package Week6.Day1;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(7);
        sb.append("Ashish Mishra");
        // System.out.println(s.ens);
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb);
    }
}
