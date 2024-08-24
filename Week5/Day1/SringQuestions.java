package Week5.Day1;

public class SringQuestions {
    
    // public static char[] reverse(String s){
    //     char[] arr=new char[s.length()];
    //     for(int i=0;i<s.length();i++){
    //         arr[i]=s.charAt(i);
    //     }
    //     int i=0;
    //     int j=s.length()-1;
    //     while(i<=j){
    //         char temp=arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=temp;
    //         i++;
    //         j--;
    //     }

    //     return arr;
    // }

    public static String reverse(String s){
        String s2="";
        for(int i=s.length()-1;i>=0;i--){
            s2+=s.charAt(i);
        }
        return s2;

    }

    // public static boolean palin(String s){
    //     int i=0;
    //     int j=s.length()-1;
    //     while(i<=j){
    //         int flag=0;
    //         if(s.charAt(i)==s.charAt(j)){
    //             i++;
    //             j--;
    //             flag=1;
    //         }
    //         if(flag==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    public static boolean palin(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
                
            }
        }
        return true;
    }

    public static char max(String s){
        char ans='0';
        int maxans=0;
        int count=0;
        for (int j2 = 0; j2 < s.length()-2; j2++) {
            if(s.charAt(j2)==s.charAt(j2+1)){
                count++;
                if(maxans<count){
                    ans=s.charAt(j2);
                    maxans=count;
                }
            }
            else{
                count=0;
            }
        }
        return ans;
    }




    
    // public static char unsortMax(String s){
    //     int[] a=new int[26];
    //     for (int i = 0; i < s.length()-1; i++) {
    //         char c=s.charAt(i);
    //         int integer=(int)c-97;
            
    //     }

    // }















    public static String[] revStringWord(String s){
        String[] ss=s.split("\\s");
        int i=0;
        int j=ss.length-1;
       while(i<=j){
            String temp=ss[i];
            ss[i]=ss[j];
            ss[j]=temp;
            i++;
            j--;
       }
       return ss;
    }

    public static void main(String[] args) {
        String[] s= revStringWord(("I Am Ashish Mishra         ").trim());
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
}
