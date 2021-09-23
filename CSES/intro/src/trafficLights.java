import java.io.BufferedReader;
import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class trafficLights {
    static int n;
    static int m;
    public static void main(String[] args) throws IOException{
        StringBuilder res = new StringBuilder("");
        BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(file.readLine());
        int x = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        TreeSet<Integer> set = new TreeSet<>();
        set.add(0);
        set.add(x);
        int[] arr = new int[n];
        st = new StringTokenizer(file.readLine());
        for (int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            set.add(arr[i]);
        }
        int ans = 0;
        int prev = 0;
        for (int curr : set){
            ans = Math.max(ans, curr-prev);
            prev = curr;
        }
        int[] out = new int[n];
        out[n-1] = ans;
        for (int i=n-1; i>0; i--){
            int curr = arr[i];
            set.remove(curr);
            ans = Math.max(set.ceiling(curr)-set.floor(curr), ans);
            out[i-1] = ans;
        }
        for (int i : out){
            res.append(i).append(" ");
        }
        System.out.println(res);
    }
}



