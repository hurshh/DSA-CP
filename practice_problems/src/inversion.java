public class inversion {
    public static void main(String[] args) {
        long[]test1 = {8, 4, 2, 1};
        System.out.println(inversionCount(test1, test1.length));
    }
    static long inversionCount(long arr[],long N){
        long count =0;
        for(long i=0;i< arr.length-1;i++){
            for(long j=i+1;j< arr.length;j++){
                if(arr[(int) j]<arr[(int) i]){
                    count++;
                }
            }
        }
        return count;
    }
}
