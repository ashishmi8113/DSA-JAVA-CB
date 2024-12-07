package Lecture36;

import java.util.HashMap;

public class TriesClass {

    public class Node{
        char val;
        boolean isTerminal;
        HashMap<Character,Node> child=new HashMap<>();
        
    }

    private Node root;
    public TriesClass(){
        Node nn=new Node();
        nn.val='*';
        root=nn;
    }
    public void insert(String s){
        Node temp=root;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(temp.child.containsKey(ch)){
                // agar contain karta hai, to move temp node to this current node
                temp=temp.child.get(ch);
            }
            else{
                //create a new node and add this to the map
                Node nn=new Node();
                nn.val=ch;
                nn.child.put(ch, nn);
                temp=nn;
            }
        }
        temp.isTerminal=true;
    }

    public boolean search(String word){
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
            }
            else{
                return false;
            }
        }
        return curr.isTerminal;
    }

    public boolean startsWith(String word) {
        Node curr=root;
        for (int i = 0; i < word.length(); i++) {
            char ch=word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr=curr.child.get(ch);
            }
            else{
                return false;
            }
        }
        return true;
    }
    
}
