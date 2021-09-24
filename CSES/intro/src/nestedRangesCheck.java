import java.io.IOException;
import java.util.*;

public class nestedRangesCheck {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        StringBuilder containing1 = new StringBuilder();
        StringBuilder isContained1 = new StringBuilder();
        StringBuilder containing2 = new StringBuilder();
        StringBuilder isContained2 = new StringBuilder();
        int[] contn = new int[n];
        int[] contd = new int[n];
        Arrays.fill(contn,0);
        Arrays.fill(contd,0);
        ArrayList<range> arr =new ArrayList<>();
        for(int i=0;i<n;i++){
            int start = rdr.nextInt();
            int end = rdr.nextInt();
            arr.add(new range(i,start,end));
        }
        custComparator cc = new custComparator();
        Collections.sort(arr,cc);
        int maxEnd = 0;
        for(int i=0;i<n;i++){
            if(arr.get(i).end <= maxEnd){
                contd[arr.get(i).index] = 1;
            }
            maxEnd = Math.max(maxEnd,arr.get(i).end);
        }
        int minEnd = Integer.MAX_VALUE;
        for(int i= n-1;i>=0;i--){
            if(arr.get(i).end >= minEnd){
                contn[arr.get(i).index] = 1;
            }
            minEnd = Math.min(minEnd,arr.get(i).end);
        }
        for (int i=0;i<n/2;i++){
            containing1.append(contn[i]).append(" ");
            isContained1.append(contd[i]).append(" ");
        }
        for(int i=n/2;i<n;i++){
            containing2.append(contn[i]).append(" ");
            isContained2.append(contd[i]).append(" ");
        }
        System.out.print(containing1);
        System.out.println(containing2);
        System.out.print(isContained1);
        System.out.println(isContained2);
    }
}

class range{
    int index;
    int start;
    int end;



    public range(int index, int start, int end) {
        this.index = index;
        this.start = start;
        this.end = end;
    }
}

class custComparator implements Comparator<range>{
    @Override
    public int compare(range o1, range o2) {
        if(o1.start> o2.start){
            return 1;
        }
        if(o1.start== o2.start && o1.end< o2.end){
            return 1;
        }
        return -1;
    }


}



