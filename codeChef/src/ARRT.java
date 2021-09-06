import java.util.ArrayList;
import java.util.Scanner;

public class ARRT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            int[] arr2 = new  int[n];
            for(int i=0;i<n;i++){
                arr1[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr2[i] = sc.nextInt();
            }
            int min = (arr1[0]+arr2[0])%n;

            for(int i=0;i<n;i++){
                if((arr1[0]+arr2[i])%n<min){
                    min = (arr1[0]+arr2[i])%n;
                }
            }
            ArrayList<Integer> minIndices = new ArrayList<>();
            for(int i=0;i<n;i++){
                if((arr1[0]+arr2[i])%n==min){
                    minIndices.add(i);
                }
            }
            if(minIndices.size()==1){
                StringBuilder str = new StringBuilder();
                for(int i=0;i<n;i++){
                    str.append((arr2[(i+minIndices.get(0))%n]+arr1[i])%n+" ");
                }
                str.setLength(2*n-1);
                System.out.println(str);
            }
            else {
                int ansSTR = 1;
//                for (int i=0;i<n;i++){
//                    if((arr1[i]+arr2[(i+minIndices.get(0))%n])%n>(arr1[i]+arr2[(i+minIndices.get(1))%n])%n){
//                        ansSTR = 2;
//                    }
//                }
                int k=0;
                while ((arr1[k]+arr2[(k+minIndices.get(0))%n])%n==(arr1[k]+arr2[(k+minIndices.get(1))%n])%n){
                    k++;
                }
                if((arr1[k]+arr2[(k+minIndices.get(0))%n])%n>(arr1[k]+arr2[(k+minIndices.get(1))%n])%n){
                    ansSTR =2;
                }
                if(ansSTR==1){
                    StringBuilder str = new StringBuilder();
                    for(int i=0;i<n;i++){
                        str.append((arr2[(i+minIndices.get(0))%n]+arr1[i])%n+" ");
                    }
                    str.setLength(2*n-1);
                    System.out.println(str);
                }
                else {
                    StringBuilder str = new StringBuilder();
                    for(int i=0;i<n;i++){
                        str.append((arr2[(i+minIndices.get(1))%n]+arr1[i])%n+" ");
                    }
                    str.setLength(2*n-1);
                    System.out.println(str);
                }
            }
        }
    }
}
