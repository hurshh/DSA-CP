import java.util.ArrayList;
import java.util.Scanner;

class ADJHATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        while(t-->0){
            int n = sc.nextInt();
            for(int i=0;i<n;i++){
                int temp = sc.nextInt();
                if(temp%2==0){
                    even.add(temp);
                }else {
                    odd.add(temp);
                }

            }
            if(even.size()!=0 || odd.size()!=0){
                System.out.println("-1");

            }
            else {
                for(int i:even){
                    System.out.print(i+" ");
                }
                for(int i:odd){
                    System.out.println(i+" ");
                }
                System.out.println();
            }
        }
    }
}
