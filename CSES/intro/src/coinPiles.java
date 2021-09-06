import java.io.IOException;
import java.util.EventListener;

public class coinPiles {
    public static void main(String[] args) throws IOException {
        Reader r1 = new Reader();
        int t = r1.nextInt();
        while(t-->0){
            long a = r1.nextLong();
            long b = r1.nextLong();
            if((2*b-a)%3==0 && (2*a-b)%3==0 && a<=2*b && b<=2*a){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}


