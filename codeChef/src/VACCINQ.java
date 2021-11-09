import java.util.HashMap;
import java.util.Scanner;

public class VACCINQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int p = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            HashMap<Integer,Integer> map= new HashMap<>();
            map.put(1,0);
            map.put(0,0);
            for(int i=0;i<n;i++){
                int temp = sc.nextInt();
                if(i<p){
                    map.put(temp, map.get(temp) + 1);
                }
            }
            int ans = map.get(0)*x + map.get(1)*y;
            System.out.println(ans);
        }
    }
}
