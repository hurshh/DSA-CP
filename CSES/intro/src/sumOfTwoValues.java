import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class sumOfTwoValues {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        long x = rdr.nextLong();
        boolean isDone = false;
        StringBuilder res= new StringBuilder("");
        TreeMap<Long,sumo2> map = new TreeMap<>();
        for(int i=1;i<=n;i++){
            long temp = rdr.nextLong();
            if(map.containsKey(temp)){
                map.get(temp).indices.add(i);
                map.put(temp,new sumo2((map.get(temp).count+1),map.get(temp).indices));
            }
            else {
                ArrayList<Integer> temp1 = new ArrayList<>();
                temp1.add(i);
                map.put(temp,new sumo2(1,temp1));
            }
        }
        for(Map.Entry<Long,sumo2> temp : map.entrySet()){
            long key = temp.getKey();
            if(map.containsKey(x-key)&&map.get(x-key).count>0 && x-key!=key){
                res.append(map.get(x-key).indices.get(0));
                res.append(" ");
                res.append(map.get(key).indices.get(0));
                isDone = true;
                break;
            }
            else if(2*key==x && temp.getValue().count>=2){
                res.append(temp.getValue().indices.get(0));
                res.append(" ");
                res.append(temp.getValue().indices.get(1));
                break;
            }
        }
        if(res.length()==0){
            System.out.println("IMPOSSIBLE");
        }
        else {
            System.out.println(res);
        }
    }
}
class sumo2{
    long count;
    ArrayList<Integer> indices = new ArrayList<>();

    sumo2(long count,ArrayList<Integer> indices){
        this.count = count;
        this.indices = indices;
    }
}





