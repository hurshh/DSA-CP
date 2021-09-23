import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Towers {
    public static void main(String[] args) throws IOException {
        Reader br = new Reader();
        int n = br.nextInt()-1;
        TreeMap<Integer,Integer> tower_header = new TreeMap();
        tower_header.put(br.nextInt(),1);
        while(n-- > 0) {
            int x = br.nextInt();

            if (tower_header.ceilingKey(x) != null) {
                if (tower_header.ceilingKey(x) != x) {
                    if(tower_header.get(tower_header.ceilingKey(x))==1)
                        tower_header.remove(tower_header.ceilingKey(x));
                    else
                        tower_header.put(tower_header.ceilingKey(x),tower_header.get(tower_header.ceilingKey(x))-1);
                    tower_header.put(x, 1);
                } else {
                    int value = tower_header.get(x);
                    tower_header.remove(x);


                    if(tower_header.ceilingKey(x) != null){
                        if(tower_header.get(tower_header.ceilingKey(x))==1)
                            tower_header.remove(tower_header.ceilingKey(x));
                        else
                            tower_header.put(tower_header.ceilingKey(x),tower_header.get(tower_header.ceilingKey(x))-1);
                    }
                    tower_header.put(x, value + 1);
                }
            }else{
                tower_header.put(x,1);
            }

        }
        int sum=0;
        for(Map.Entry<Integer,Integer> entry : tower_header.entrySet()){
            sum+=entry.getValue();
        }
        System.out.println(sum);
    }
}



