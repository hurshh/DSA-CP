import java.util.Scanner;

public class infinityTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int valX = 1,valY =1;
            int X = 0,Y=0;
            while(valX<=n){
                X++;
                valX = 1+((X-1)*(X-1));
            }
            X--;
            valX = 1+((X-1)*(X-1));
            while(valY<=n){
                if(valY==n){
                    break;
                }
                Y++;
                valY = Y*Y;
            }
            if(X>=Y && n<=(valX+X-1)){
                int y=0;
                while (valX++!=n){
                    y++;
                }
                y++;
                System.out.println(y+" "+X);
            }
            else{
                int x=0;
                while (valY--!=n){
                    x++;
                }
                x++;
                System.out.println(Y+" "+x);
            }
        }
    }
}
