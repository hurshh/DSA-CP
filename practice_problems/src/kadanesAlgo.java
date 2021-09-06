public class kadanesAlgo {
    public static void main(String[] args) {
        int[] test1 = {-1,-2,-3,-4};
        KadaneAlgo k1= new KadaneAlgo();
        System.out.println(k1.maxSubarraySum(test1, test1.length));
    }
}
class KadaneAlgo{
    int maxSubarraySum(int[] arr,int n){
        int max=arr[0] ,sumTillNow = arr[0], i=1;
        while (i<n){
            sumTillNow += arr[i];
            if(sumTillNow>max){
                max = sumTillNow;
            }
            if(sumTillNow<0){
                sumTillNow =0;
            }
            i++;
        }
        return max;
    }
}
