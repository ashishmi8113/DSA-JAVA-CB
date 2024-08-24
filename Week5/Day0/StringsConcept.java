package Week5.Day0;

public class StringsConcept {
    public static void main(String[] args) {
        // String s1="Ashish";
        // String s2="Ashish";
        // String s3=new String(s1);
        // char[] c={'A','s','h','i','s','h'};
        // String s4=new String(c);
        // String s5=new String("Ashish");
        // s1.concat(" Mishra");
        // System.out.println(s1);
        // System.out.println(s2);
        // System.out.println(s3);
        // System.out.println(s4);
        // System.out.println(s5);
        // System.out.println(s1==s2);
        // System.out.println(s1==s3);
        // System.out.println(s1==s4);
        // System.out.println(s1==s5);
        // System.out.println(s2==s3);
        // System.out.println(s2==s4);
        // System.out.println(s2==s5);
        // System.out.println(s3==s4);
        // System.out.println(s3==s5);
        
        
        
        
        
        String s1="ashish";
        String s2="Ashish Mishra";
        String s3="Ashish";
        String s4="";
        String s5="   Ashi  sh   ";
        System.out.println(s1.charAt(2));
        System.out.println(s1.length());
        System.out.println(s1.substring(1, 4));
        System.out.println(s2.contains(s1));
        
        System.out.println(s2.equals(s1));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.compareTo(s3));

        System.out.println(s4.isEmpty());
        System.out.println(s4.concat(s1));
        System.out.println(s4);
        System.out.println(s1.replace("a", "81"));
        System.out.println(s1);
        System.out.println(s5.trim());
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        



    }
}
