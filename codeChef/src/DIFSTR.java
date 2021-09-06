import java.util.HashSet;
import java.util.Scanner;

public class DIFSTR {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                sc.nextLine();
                HashSet<Integer> h = new HashSet<>();
                for (int i = 0; i < n; i++) {
                    String str = sc.nextLine();
                    int deci = Integer.parseInt(str, 2);
                    h.add(deci);
                }
                int pow = (int) Math.pow(2, n);
                for (int i = 0; i < pow; i++) {
                    StringBuilder str = new StringBuilder();
                    if (h.contains(i) == false) {
                        for (int j = 0; j < n; j++) {
                            str.append(i % 2);
                            i /= 2;
                        }
                        System.out.println(str.reverse());
                        break;
                    }
                }
            }
    }
}
