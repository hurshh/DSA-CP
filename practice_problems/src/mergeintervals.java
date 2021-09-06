import java.util.Arrays;
import java.util.LinkedList;

public class mergeintervals {
    public static void main(String[] args) {

    }
}
class solutionmerge {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);
        LinkedList<int[]> mergerd = new LinkedList<>();
        for(int[] interval : intervals){
            if(mergerd.isEmpty()){
                mergerd.add(interval);
            }
            if(interval[0] > mergerd.getLast()[1]){
                mergerd.add(interval);
            }
            else{
                mergerd.getLast()[1] = Math.max(interval[1],mergerd.getLast()[1]);
            }
        }
        return mergerd.toArray(new int[mergerd.size()][]);
    }
}
