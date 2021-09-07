import java.util.Scanner;

public class ShortestPathWithObstacles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long Ax = sc.nextLong();
            long Ay = sc.nextLong();
            long Bx = sc.nextLong();
            long By = sc.nextLong();
            long Fx = sc.nextLong();
            long Fy = sc.nextLong();
            long totalx = Bx - Ax;
            long ans = 0;
            if(totalx<0){
                totalx *= -1;
            }
            long toaly = By - Ay;
            if(toaly<0){
                toaly *= -1;
            }
            if(totalx ==0 && Ax == Fx){
                if((Ay <= Fy && Fy <= By) || (Ay >= Fy && Fy >= By)){
                    ans = toaly+2;
                }
                else {
                    ans = toaly;
                }
            }
            else if(toaly ==0 && Ay == Fy){
                if((Ax <= Fx && Fx <= Bx) || (Ax >= Fx && Fx >= Bx)){
                    ans = totalx+2;
                }
                else {
                    ans = totalx;
                }
            }
            else {
                ans = totalx+toaly;
            }
            System.out.println(ans);
        }
    }
}
