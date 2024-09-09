package Week8.Day1;

public class PermutationClass {
    public static void permutation(String q, String ans){
        if(q.length()==0){
            System.out.print(ans+" ");
            return;
        }
        for (int i = 0; i < q.length(); i++) {
            String s1=q.substring(0, i);
            String s2=q.substring(i+1);
            permutation(s1+s2, ans+q.charAt(i));
        }
    }
    public static void main(String[] args) {
        permutation("abc", "");
    }
}
