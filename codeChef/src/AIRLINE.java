import java.util.Arrays;
import java.util.Scanner;

public class AIRLINE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int[] arr = new int[3];
            for(int i=0;i<3;i++){
                arr[i] = sc.nextInt();
            }
            int d = sc.nextInt();
            int e = sc.nextInt();
            Arrays.sort(arr);
            if((arr[1]+arr[2])<=d && arr[0]<=e){
                System.out.println("yes");
            }
            else{
                if((arr[0]+arr[2])<=d && arr[1]<=e){
                    System.out.println("yes");
                }
                else {
                    if((arr[0]+arr[1])<=d && arr[2]<=e){
                        System.out.println("yes");
                    }
                    else{
                        System.out.println("no");
                    }
                }
            }
        }
    }
}
