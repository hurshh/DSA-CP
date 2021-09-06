//day1
public class shell_sort {
    public static void main(String[] args){
        int[] test1 = {1,0,4,3,7,2,8};
        shellSort(test1);
    }
    public static void shellSort(int[] arr){
        int len = arr.length;
        int gap = len/2;
        while(gap>0){
            for(int i=gap;i<len;i+=gap){
                int temp = arr[i],j = i;
                while (arr[j-gap]>temp){
                    arr[j] = arr[j-gap];
                    j -=gap;
                    if(j<=0){
                        break;
                    }
                }
                arr[j]= temp;
            }
            gap /= 2;
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
