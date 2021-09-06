import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinimizeTheHeight {
    public static void main(String[] args){
        solutionMIN s1 = new solutionMIN();
        int[] test1 = {1, 5, 8, 10};
        int[] test2 = {3, 9, 12, 16, 20};
        System.out.println(s1.getMinDiff(test1,4,2));
        System.out.println(s1.getMinDiff(test2,5,3));
    }
}

class solutionMIN{
    int getMinDiff(int[] arr, int n,int k){
        ArrayList<tower> possibleHeights = new ArrayList<>();
        int[] visited = new int[n];
        for(int i=0;i< arr.length;i++){
            if(arr[i]-k>=0){
                possibleHeights.add(new tower(arr[i]-k,i));
            }
            possibleHeights.add(new tower(arr[i]+k,i));
            visited[i] = 0;
        }
        Collections.sort(possibleHeights,(a,b) -> a.height- b.height);
        int element=0,left=0,right=0,size= possibleHeights.size();
        while (element<n && right<size){
            if(visited[possibleHeights.get(right).getIndex()] ==0){
                element++;
            }
            visited[possibleHeights.get(right).getIndex()]++;
            right++;
        }
        int ans = possibleHeights.get(right-1).getHeight() - possibleHeights.get(left).getHeight();
        while (right<size){
            if(visited[possibleHeights.get(left).getIndex()] ==1){
                element--;
            }
            visited[possibleHeights.get(left).getIndex()]--;
            left++;
            while (element<n && right<size){
                if(visited[possibleHeights.get(right).getIndex()] ==0){
                    element++;
                }
                visited[possibleHeights.get(right).getIndex()]++;
                right++;

            }
            if(element==n){
                ans = Math.min(ans,possibleHeights.get(right-1).getHeight() - possibleHeights.get(left).getHeight());
            }
            else {
                break;
            }

        }

        return ans;
    }

}
class tower{
    int height;
    int index;
    public tower(){};
    public tower(int height,int index){
        this.height = height;
        this.index = index;
    }
    public int getHeight(){
        return this.height;
    }
    public int getIndex(){
        return this.index;
    }
}
