package Lecture31;

public class Hash_Implementation {
    public static void main(String[] args) {
        HashMapClass<String, Integer> map = new HashMapClass<>();
        map.put("Riya", 90);
        map.put("Nitish", 77);
        map.put("Akash", 67);
        map.put("Zaid", 76);
        map.put("Omika", 88);
        map.put("Puneet", 77);
        System.out.println(map);
        // map.put("Omika", 18);
        // System.out.println(map);
        System.out.println(map.get("Raj"));
        System.out.println(map.get("Riya"));
        System.out.println(map.containsKey("Raj"));
        System.out.println(map.containsKey("Riya"));
        System.out.println(map.remove("Riya"));
        System.out.println(map);
    }
}
