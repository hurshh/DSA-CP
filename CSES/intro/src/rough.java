import java.util.*;

public class rough {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> treemap = new TreeMap<>();
        treemap.put(1,3);
        treemap.put(2,4);
        System.out.println(treemap.lowerEntry(2).getValue());
    }
}
