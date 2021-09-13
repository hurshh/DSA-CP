import java.io.IOException;
import java.util.Arrays;

public class RestaurantCustomers {
    public static void main(String[] args) throws IOException {
        Reader rdr = new Reader();
        int n = rdr.nextInt();
        int[] arrivalTimes = new int[n];
        int[] departureTimes = new int[n];
        for(int i=0;i<n;i++){
            arrivalTimes[i] = rdr.nextInt();
            departureTimes[i] = rdr.nextInt();
        }
        Arrays.sort(arrivalTimes);
        Arrays.sort(departureTimes);
        int max=0,arrivalIndex=0,departureIndex=0,currentCount=0;
        while(arrivalIndex<n && departureIndex<n){
            if(arrivalTimes[arrivalIndex]<departureTimes[departureIndex]){
                currentCount++;
                arrivalIndex++;
                if(currentCount>=max){
                    max = currentCount;
                }
            }
            else {
                if(arrivalTimes[arrivalIndex]>departureTimes[departureIndex]){
                    currentCount--;
                    departureIndex++;
                }
                else {
                    arrivalIndex++;
                    departureIndex++;
                }
            }

        }
        System.out.println(max);
    }
}


