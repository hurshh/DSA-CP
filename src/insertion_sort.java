//day1
public class insertion_sort {
    public static void main(String[] args){
        int[] test1 = {1,0,4,3,7,2,8};
        insertionSort(test1);
    }
    public static void insertionSort(int[] arr){
        int len = arr.length;
        for(int i=1;i<len;i++){
            int temp = arr[i];
            int j=i;
            while (arr[j-1]>temp){
                arr[j] = arr[j-1];
                j--;
                if(j<1){
                    break;
                }
            }
            arr[j] = temp;
        }
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
