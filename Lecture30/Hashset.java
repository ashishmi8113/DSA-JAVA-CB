package Lecture30;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class Hashset {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        TreeSet<Integer> ts=new TreeSet<>();
        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(4);
        hs.add(-10);
        hs.add(10);
        hs.add(0);
        hs.add(40);
        hs.add(4);

        ts.add(1);
        ts.add(5);
        ts.add(4);
        ts.add(-10);
        ts.add(10);
        ts.add(0);
        ts.add(40);
        ts.add(4);

        ls.add(1);
        ls.add(5);
        ls.add(4);
        ls.add(-10);
        ls.add(10);
        ls.add(0);
        ls.add(40);
        ls.add(4);
        System.out.println(hs);
        System.out.println(ts);
        System.out.println(ls);
    }
}
