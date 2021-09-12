import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class creatingStrings {
    public static void main(String[] args) throws IOException {
        Reader r = new Reader();
        String qString = r.readLine();
        int len = qString.length();
        char[] question = qString.toCharArray();
        Arrays.sort(question);
        int count =0;
        ArrayList<cstrng> carr = new ArrayList<>();
        for(int i=0;i<len;i++){
            if(i==len-1){
                if(count>0){
                    carr.add(new cstrng(question[i],++count));
                }
            }
            else if(question[i]==question[i+1]){
                count++;
            }
            else {
                if(count>0){
                    carr.add(new cstrng(question[i],++count));
                }
                count =0;
            }
        }
        long Nans= factorial(len);
        if(carr.size()>0){
            for(int i=0;i< carr.size();i++){
                int temp = carr.get(i).count;
                Nans /= factorial(temp);
            }
        }
        StringBuilder ansStr = new StringBuilder("");
        System.out.println(Nans);
        System.out.println(question);
        for (int i=0;i<Nans-1;i++){
            nextpermutation(question);
            ansStr.append(question);
            ansStr.append("\n");
        }
        System.out.println(ansStr);
    }
    static int factorial(int n)
    {
        int res = 1, i;
        for (i=2; i<=n; i++)
            res *= i;
        return res;
    }
    public static void nextpermutation ( char[] arr){
        int lastIndex = arr.length - 1;
        int switchIndex = lastIndex - 1;
        while (switchIndex >= 0 && arr[switchIndex] >= arr[switchIndex + 1]) {
            switchIndex--;
        }
        if(switchIndex<0){
            reverseArray(arr,0);
            return;
        }
        int nextGreatestIndex = lastIndex;
        while (arr[nextGreatestIndex] <= arr[switchIndex]) {
            nextGreatestIndex--;
        }
        swap(arr, switchIndex, nextGreatestIndex);
        reverseArray(arr, switchIndex + 1);
    }
    public static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reverseArray(char[] arr, int start){
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
class cstrng{
    char a;
    int count;
    cstrng(){}
    cstrng(char a,int count){
        this.a = a;
        this.count = count;
    }
}
