import java.io.IOException;

class RACINGEN {
    public static void main(String[] args) throws IOException {
        fastr sc = new fastr();
        int t = sc.nextInt();
        while (t-->0){
            long x = sc.nextLong();
            long r = sc.nextLong();
            r *= 60;
            long m = sc.nextLong();
            long time = m*60;
            if(time<r){
                System.out.println("NO");
            }
            else if(x >= r){
                System.out.println("YES");
            }
            else {
                long res = x;
                res += (time-x)/2;
                System.out.println(res>= r ? "YES" : "NO");
            }
        }
    }
}


