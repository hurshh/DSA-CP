import java.util.*;

class FAKESWAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            long n = sc.nextLong();
            String string1 = sc.next();
            String string2 = sc.next();
            boolean flag = true;
            for(int i = 0; i < (int) n; i++) {
                if(string1.charAt(i) != string2.charAt(i)) {
                    flag = false;
                    break;
                }
            }
            if(flag == true) {
                System.out.println("YES");
            }
            else {
                long zero = 0, one = 0;
                for(int i = 0; i < (int) n; i++) {
                    if(string2.charAt(i) == '1') {
                        one++;
                    } else {
                        zero++;
                    }
                }
                if(one > 0 && zero > 0) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }
            }
        }
    }
}
