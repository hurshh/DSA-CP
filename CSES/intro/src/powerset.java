import java.util.ArrayList;

public class powerset {
    public static void main(String[] args) {
        ArrayList<Integer> subsets = new ArrayList<>();
        search(subsets,1,3);
    }
    static void search(ArrayList<Integer> subsets,int k,int n){
        if(k==n+1){
            for(int i: subsets){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        else{
            subsets.add(k);
            search(subsets,k+1,n);
            subsets.remove(subsets.size()-1);
            search(subsets,k+1,n);
        }
    }
}
