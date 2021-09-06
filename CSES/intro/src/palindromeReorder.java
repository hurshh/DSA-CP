import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class palindromeReorder {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String qstr = sc.nextLine();
        StringBuilder answer = new StringBuilder();
        int count =0;
        boolean[] check = new boolean[26];
        for(int i=0;i<qstr.length();i++){
            int charPos = qstr.charAt(i)-'A';
            if(check[charPos]==false){
                check[charPos] = true;
                count++;
            }
            else {
                answer.append(qstr.charAt(i));
                check[charPos] = false;
                count--;
            }
        }
        if(count>=2){
            System.out.println("NO SOLUTION");
        }
        else {
            System.out.print(answer);
            for (int i=0;i<26;i++){
                if(check[i]){
                    System.out.print((char) (i +'A'));
                }
            }
            System.out.println(answer.reverse());
        }
    }
}




