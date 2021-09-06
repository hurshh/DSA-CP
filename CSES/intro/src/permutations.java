import java.util.Scanner;

public class permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            System.out.print("1");
        }
        else {
            if (n <= 3 && n != 1) {
                System.out.println("NO SOLUTION");
            } else {
                int[] even = new int[n];
                int[] odd = new int[n];
                int x=0,y=0;
                int val =1;
                while(val<=n){
                    odd[x++] = val;
                    val+=2;
                }
                val=2;
                while(val<=n){
                    even[y++] = val;
                    val+=2;
                }
                StringBuilder sb = new StringBuilder();
                for(int i=0;i<y;i++){
                    sb.append(even[i]+" ");
                }
                for(int i=0;i<x;i++){
                    sb.append(odd[i]+" ");
                }
                System.out.println(sb);
            }
        }

    }
}
