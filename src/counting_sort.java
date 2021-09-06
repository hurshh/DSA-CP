//day1
public class counting_sort {
    public static void main(String[] args){
        int[] test1 = {2,2,3,1,1,4,5,4,4};
        countSort(test1);
    }
    // this method is good for sorting numbers in given range(a,b)
    public static int[] countingArray(int[] arr,int n){
        int len = arr.length;
        int[] countingArray = new int[n];
        for(int i=0;i<n;i++){
            countingArray[i] = 0;
        }
        for(int i=0;i<len;i++){
            countingArray[arr[i]] += 1;
        }
        return countingArray;
    }
    public static void countSort(int[] arr){
        int[] countingArray = countingArray(arr,arr.length);
        int index=0,sortedIndex =0;
        while(index<arr.length){
            while(countingArray[index]!=0 && sortedIndex< arr.length){
                arr[sortedIndex] = index;
                countingArray[index] -= 1;
                sortedIndex++;
            }
            index++;
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
