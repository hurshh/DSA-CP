import java.util.HashMap;
import java.util.Map;

public class hashmapuh {
    public static void main(String[] args) {
        Map<String,MyObjecy> map = new HashMap<>();
        map.put("XYZ",new MyObjecy(1,2,"rand1"));
        map.put("ABC",new MyObjecy(2,3,"rand2"));
        System.out.println(map.get("XYZ"));
        System.out.println(map.get("ABC").name);
    }
}

class MyObjecy{
    int x,y;
    String name;
    public MyObjecy(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public MyObjecy() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "MyObjecy{" +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'' +
                '}';
    }
}
