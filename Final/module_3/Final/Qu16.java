import java.util.*;

public class Qu16 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("samsung");
        set.add("apple");
        set.add("mi");
        set.add("vivo");
        set.add("oneplus");
        set.add("samsung");
        set.add("apple");
        set.add("mi");
        set.add("vivo");
        set.add("oneplus");
        for (String p : set) {
            System.out.println(p);
        }

    }
}
