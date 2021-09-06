import java.io.IOException;
import java.util.Scanner;

public class towerOfHanoi {
    static StringBuilder str = new StringBuilder();
    static int count=0;
    public static void main(String[] args) throws IOException {
        Reader sc = new Reader();

        int n = sc.nextInt();
        TOH(n,1,2,3);
        System.out.println(count);
        System.out.println(str);
    }
    static void TOH(int n,int a,int b,int c){
        if(n>0){
            TOH(n-1,a,c,b);
            str.append(a+" "+c+"\n");
            TOH(n-1,b,a,c);
            count++;
        }
    }
}


