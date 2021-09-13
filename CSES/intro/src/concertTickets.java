import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class concertTickets {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        int m = rdr.nextInt();
        StringBuilder res = new StringBuilder("");
        TreeMap<Integer,Integer> ConcertTickets = new TreeMap<>();
        Map.Entry<Integer,Integer> CustomerPrice;
        int value;
        for(int i=0;i<n;i++){
            int temp = rdr.nextInt();
            if(ConcertTickets.containsKey(temp)){
                ConcertTickets.put(temp,ConcertTickets.get(temp)+1);
            }
            else {
                ConcertTickets.put(temp,1);
            }
        }
        for(int i=0;i<m;i++){
            int temp = rdr.nextInt();
            CustomerPrice = ConcertTickets.floorEntry(temp);
            if(CustomerPrice !=null){
                res.append(CustomerPrice.getKey());
                res.append("\n");
                if(CustomerPrice.getValue()==1){
                    ConcertTickets.remove(CustomerPrice.getKey());
                }
                else {
                    ConcertTickets.put(CustomerPrice.getKey(),CustomerPrice.getValue()-1);
                }
            }
            else {
                res.append("-1\n");
            }
        }
        System.out.println(res);
    }
}
