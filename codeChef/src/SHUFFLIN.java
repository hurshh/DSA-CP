import java.util.Scanner;

public class SHUFFLIN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long evenNumbers=0,oddNumbers=0;
            for(int i=0;i<n;i++){
                long temp = sc.nextLong();
                if(temp%2==0){
                    evenNumbers++;
                }
                else {
                    oddNumbers++;
                }
            }
            long evenIndices = n/2;
            long oddIndices = n-evenIndices;
            System.out.println((Math.min(evenNumbers,oddIndices)+Math.min(oddNumbers,evenIndices)));
        }
    }
}
