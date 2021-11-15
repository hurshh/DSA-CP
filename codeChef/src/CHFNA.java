import java.io.IOException;

public class CHFNA {
    public static void main(String[] args) throws IOException {
        fastr rdr = new fastr();
        int t = rdr.nextInt();
        while (t-->0){
            int x = rdr.nextInt();
            int y = rdr.nextInt();
            System.out.println(x^y);
        }
    }
}
