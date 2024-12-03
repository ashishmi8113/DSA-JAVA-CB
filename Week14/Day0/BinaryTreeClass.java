package Week14.Day0;

import java.util.*;

public class BinaryTreeClass {
    class Node{
        int val;
        Node left;
        Node right;
    }
    public Node root=null;
    Scanner sc=new Scanner(System.in);
    
    public BinaryTreeClass(){
        root=createTree();
    }

    public Node createTree(){
        System.out.print("Value :- ");
        int data=sc.nextInt();
        Node nn=new Node();
        nn.val=data;

        System.out.print("Has Left Child ??");
        boolean hlc=sc.nextBoolean();
        if(hlc){
            nn.left=createTree();
        }
        System.out.print("Has Right Child ??");
        boolean hrc=sc.nextBoolean();
        if(hrc){
            nn.right=createTree();
        }

        return nn;
    }

    public void display(){
        displayTree(root);
    }

    private void displayTree(Node nn){
        if(nn==null){
            return;
        }
        String output="<--"+nn.val+"-->";
        if(nn.left!=null){
            output=nn.left.val+output;
        }
        else if(nn.left==null){
            output="null"+output;
        }
        if(nn.right!=null){
            output=output+nn.right.val;
        }
        else if(nn.right==null){
            output=output+"null";
        }
        // System.out.println(output);
        displayTree(nn.left);
        displayTree(nn.right);
    }


    public int maxValue(){
        int ans=Integer.MIN_VALUE;
        return maxTreeValue(root,ans);
    }



    public int maxTreeValue(Node nn, int ans){
        
        if(nn==null){
            return ans;
        }
        if(ans<nn.val){
            ans=nn.val;
        }
        int a= maxTreeValue(nn.left, ans);
        int b=maxTreeValue(nn.right, ans);
        return Math.max(a,b);
    }



    public boolean isPresent(Node nn, int ans){
        
        if(nn==null){
            return false;
        }
        if(ans==nn.val){
            return true;
        }
        boolean leftChild=isPresent(nn.left, ans);
        boolean rightChild=isPresent(nn.right, ans);
        return (leftChild || rightChild);
    }

    public int height(Node nn){
        if(nn==null){
            return 0;
        }
        int a= 1+height(nn.left);
        int b=1+height(nn.right);
        return Math.max(a,b);
    }

    public void infix(Node nn){
        if(nn==null){
            return;
        }
        infix(nn.left);
        System.out.print(nn.val+" ");
        infix(nn.right);
    }

    public void prefix(Node nn){
        if(nn==null){
            return;
        }
        System.out.print(nn.val+" ");
        infix(nn.left);
        infix(nn.right);
    }
    public void postfix(Node nn){
        if(nn==null){
            return;
        }
        infix(nn.left);
        infix(nn.right);
        System.out.print(nn.val+" ");
    }


}
