import java.io.IOException;
import java.util.ArrayList;

public class twoSets {
    public static void main(String[] args) throws IOException {
        Reader r1 = new Reader();
        long n = r1.nextLong();
        isTwoSets(n);
    }
    static void isTwoSets(long n){
        if((n*(n+1))%4 ==0){
            long setSum = (n*(n+1))/4,str1cnt=0,str2cnt=0;
            //ArrayList<Long> arr1 = new ArrayList<>();
            //ArrayList<Long> arr2 = new ArrayList<>();
            StringBuilder str1 = new StringBuilder();
            StringBuilder str2 = new StringBuilder();
            long ctr = n;
            while (ctr>0){
                if(setSum-ctr>=0){
                    //arr1.add(ctr);
                    setSum -= ctr;
                    str1.append(ctr+" ");
                    str1cnt++;
                }
                else {
                    //arr2.add(ctr);
                    str2.append(ctr+" ");
                    str2cnt++;
                }
                ctr--;
            }
            System.out.println("YES");
            System.out.println(str1cnt);
            System.out.println(str1);
            System.out.println(str2cnt);
            System.out.println(str2);
        }
        else {
            System.out.println("NO");
        }
    }
    static void printList(ArrayList<Long> arr){
        for(long l:arr){
            System.out.print(l+" ");
        }
        System.out.println();
    }
}


