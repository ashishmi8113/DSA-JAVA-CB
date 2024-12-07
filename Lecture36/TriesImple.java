package Lecture36;

public class TriesImple {
    public static void main(String[] args) {
        TriesClass t=new TriesClass();
        t.insert("Ashish");
        t.insert("null");
        t.insert("nullValue");
        System.out.println(t.search("ashish"));
    }
}
