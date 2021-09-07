import java.util.*;

public class PairProgramming {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while (t-- > 0) {

            int k = obj.nextInt();
            int n = obj.nextInt();
            int m = obj.nextInt();
            int a[] = new int[n];
            int b[] = new int[m];
            for (int i = 0; i < n; i++)
                a[i] = obj.nextInt();
            for (int i = 0; i < m; i++)
                b[i] = obj.nextInt();
            int[] ans = new int[n + m];
            for (int i = 0; i < n + m; i++)
                ans[i] = -1;
            int ai = 0, bi = 0, x = 0;
            boolean flag = false;
            while (ai <= n - 1 && bi <= m - 1) {

                if (a[ai] > k && b[bi] > k) {
                    flag = true;
                    break;
                } else if (a[ai] > k) {
                    ans[x] = b[bi];
                    if (b[bi] == 0)
                        k++;
                    x++;
                    bi++;

                } else if (b[bi] > k) {
                    ans[x] = a[ai];
                    if (a[ai] == 0)
                        k++;
                    x++;
                    ai++;
                } else {
                    if (a[ai] == 0) {
                        ans[x] = 0;
                        x++;
                        ai++;
                        k++;
                    } else if (b[bi] == 0) {


                        ans[x] = 0;
                        x++;
                        bi++;
                        k++;

                    } else {

                        if (Math.min(a[ai], b[bi]) == a[ai]) {
                            ans[x] = a[ai];
                            x++;
                            ai++;
                        } else {
                            ans[x] = b[bi];
                            x++;
                            bi++;
                        }
                    }
                }
            }
            if (flag) {
                System.out.println(-1);
                continue;
            }
            boolean flag3 = false, flag4 = false;
            if (ai == n) {
                for (int i = bi; i < m; i++) {
                    if (b[i] == 0) {
                        k++;
                        ans[x] = 0;
                        x++;

                    } else if (b[i] > k) {
                        System.out.println(-1);
                        flag3 = true;
                        break;
                    } else {
                        ans[x] = b[i];
                        x++;
                    }
                }
            } else {
                for (int i = ai; i < n; i++) {
                    if (a[i] == 0) {
                        k++;
                        ans[x] = 0;
                        x++;
                    } else if (a[i] > k) {
                        System.out.println(-1);
                        flag4 = true;
                        break;
                    } else {
                        ans[x] = a[i];
                        x++;
                    }
                }
            }
            if (flag3 || flag4)
                continue;
            for (int i = 0; i < n + m; i++) {
                System.out.print(ans[i] + " ");
                ;
            }
            System.out.println();
        }
    }
}
