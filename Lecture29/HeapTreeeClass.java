package Lecture29;

import java.util.ArrayList;

public class HeapTreeeClass {
    private ArrayList<Integer> list=new ArrayList<>();

    public HeapTreeeClass(){}
    public HeapTreeeClass(int[] arr){
        for(int i:arr){
            add(i);
        }
    }

    public void add(int data){
        list.add(data);
        upHeapify(list.size()-1);
    }

    
    public void swap(int pi, int ci){
        int val1=list.get(pi);
        int val2=list.get(ci);
        list.set(pi,val2);
        list.set(ci, val1);
    }

    public void display(){
        System.out.println(list);
    }
    
    public int size(){
        return list.size();
    }
    
    public void upHeapify(int ci){
        int pi=(ci-1)/2;
        if(list.get(pi)>list.get(ci)){
            swap(pi,ci);
            upHeapify(pi);
        }
    }









    public int remove(){
        swap(0, list.size()-1);
        int re=list.remove(list.size()-1);
        downHeapify(0);
        return re;
    }

    public void downHeapify(int pi){
        int l=pi*2+1;
        int r=pi*2+2;
        int min=pi;
        if(l<list.size() && list.get(min)>list.get(l)){
            min=l;
        }
        if(r<list.size() && list.get(min)>list.get(r)){
            min=r;
        }
        if(min!=pi){
            swap(pi, min);
            downHeapify(min);
        }
    }

}
