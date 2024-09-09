package Week8.OOpsClass;

public class cat {
    String name;
    String color;
    String breed;

    public cat(){
        this.name="unknown_Cat";
        this.color="unknown_color";
        this.breed="unknown _breed";
    }
    public cat(String name, String color, String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;
    }

    void callCat(){
        System.out.println(this.name+" of color "+this.color+" is Saying Hello");
        System.out.println();
    }
    void getter(){
        System.out.println(this.name);
        System.out.println(this.color);
        System.out.println(this.breed);
        System.out.println();
    }
}
