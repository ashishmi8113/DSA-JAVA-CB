package Week8.Day0;

public class generateParenthesis {
    public static void generate(int n, int l, int r, String ans){
        if(l==n && r==n){
            System.out.print(ans+" ");
            return;
        }
        else if(l>=r && l<=n){
            generate(n, l+1, r, ans+"{");
            generate(n, l, r+1, ans+"}");
        }
    }
    public static void main(String[] args) {
        generate(3, 0, 0, "");
    }   
}

