import java.util.Arrays;
import java.util.Scanner;

class EQDIFFER {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int max=0,count=1;
            for(int i=0;i<n-1;i++){
                if(arr[i]==arr[i+1]){
                    count++;
                    if(count>max){
                        max = count;
                    }
                }
                else {
                    count=1;
                }
            }
            if(n<=2){
                System.out.println("0");
            }
            else {
                if(max<=2){
                    System.out.println(n-2);
                }
                else {
                    System.out.println(n - max);
                }
            }
        }
    }
}
