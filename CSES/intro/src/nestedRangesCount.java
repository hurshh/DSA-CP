import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class nestedRangesCount {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        StringBuilder containing1 = new StringBuilder();
        StringBuilder isContained1 = new StringBuilder();
        int[] contn = new int[n];
        int[] contd = new int[n];
        Arrays.fill(contn,0);
        Arrays.fill(contd,0);
        ArrayList<range1> arr =new ArrayList<>();
        for(int i=0;i<n;i++){
            int start = rdr.nextInt();
            int end = rdr.nextInt();
            arr.add(new range1(i,start,end));
        }
        custComparator1 cc = new custComparator1();
        Collections.sort(arr,cc);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr.get(i).end>=arr.get(j).end){
                    contn[arr.get(i).index]+=1;
                    contd[arr.get(j).index]+=1;
                }
                else {
                    break;
                }
            }
        }
        for (int i=0;i<n;i++){
            containing1.append(contn[i]).append(" ");
            isContained1.append(contd[i]).append(" ");
        }
        System.out.println(containing1);
        System.out.println(isContained1);
    }
}

class range1{
    int index;
    int start;
    int end;



    public range1(int index, int start, int end) {
        this.index = index;
        this.start = start;
        this.end = end;
    }
}

class custComparator1 implements Comparator<range1> {

    @Override
    public int compare(range1 o1, range1 o2) {
        if(o1.start> o2.start){
            return 1;
        }
        if(o1.start== o2.start && o1.end< o2.end){
            return 1;
        }
        return -1;
    }
}

