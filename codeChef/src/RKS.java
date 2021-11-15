import java.util.*;

class RKS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = n-k;
            HashSet<Integer> rowSet = new HashSet<>();
            HashSet<Integer> columnSet = new HashSet<>();
            while (k-->0){
                int tempRow = sc.nextInt();
                rowSet.add(tempRow);
                int tempColumn = sc.nextInt();
                columnSet.add(tempColumn);
            }
            ArrayList<Integer> resRow = new ArrayList<>();
            ArrayList<Integer> resColumn = new ArrayList<>();
            for (int i=1;i<=n;i++){
                if(!rowSet.contains(i)){
                    resRow.add(i);
                }
                if(!columnSet.contains(i)){
                    resColumn.add(i);
                }
            }
            StringBuilder ans = new StringBuilder();
            ans.append(p).append(" ");
            for(int i =0;i< p;i++){
                ans.append(resRow.get(i)).append(" ");
                ans.append(resColumn.get(i)).append(" ");
            }
            System.out.println(ans);
        }
    }
}

