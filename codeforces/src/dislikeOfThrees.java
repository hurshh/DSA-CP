import java.util.Scanner;

//https://codeforces.com/contest/1560/problem/A
public class dislikeOfThrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            hat3(n);
        }
//        for (int i=1;i<25;i++){
//            System.out.println(dislikeThree(i));
//        }
    }
   static void hat3 (int n){
        int countnmber =1;
        while (true){
            if(countnmber%3 != 0 && countnmber %10 !=3){
                n--;
                if(n==0){
                    System.out.println(countnmber);
                    break;
                }
            }
            countnmber++;
        }
   }
}
