import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        long count=0,max=0;
        int n = str.length();
        for(int i=0;i<n-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            if(str.charAt(i)!=str.charAt(i+1)){
                count = 0;
            }
            if(count>max){
                max = count;
            }
        }
        max++;
        System.out.println(max);
    }
}
