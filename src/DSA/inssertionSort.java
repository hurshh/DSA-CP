package DSA;

public class inssertionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,1,6,5,0};
        InsertionSort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    static void InsertionSort(int[] arr){
        int len = arr.length;
        for(int i=1;i<len;i++){
            int temp = arr[i];
            int tempIndex = i-1;
            while (tempIndex>=0 && arr[tempIndex]>temp){
                arr[tempIndex+1] = arr[tempIndex];
                tempIndex--;
            }
            arr[tempIndex+1] = temp;
        }
    }
}

