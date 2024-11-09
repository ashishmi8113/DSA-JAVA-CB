package Week14.Day1;

public class BSTClass {
    class Node{
        int val;
        Node left;
        Node right;
    }
    public Node root;

    public BSTClass(int[] arr){
        root=createBST(arr,0,arr.length-1);
    }

    public Node createBST(int[] arr, int low, int high){
        if(low>high) return null;
        int mid=(low+high)/2;
        Node nn=new Node();
        nn.val=arr[mid];
        nn.left=createBST(arr, low, mid-1);
        nn.right=createBST(arr, mid+1, high);
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
        else if(nn.left==null){
            output=output+"null";
        }
        System.out.println(output);
        displayTree(nn.left);
        displayTree(nn.right);
    }

}
