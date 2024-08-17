package Week5.Day0;

public class StringsConcept {
    public static void main(String[] args) {
        String s1="Ashish";
        String s2="Ashish";
        String s3=new String(s1);
        char[] c={'A','s','h','i','s','h'};
        String s4=new String(c);
        s1.concat(" Mishra");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s2==s3);
        System.out.println(s2==s4);
        System.out.println(s3==s4);
    }
}
