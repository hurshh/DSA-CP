//day1
public class selection_sort {
    public static void main(String[] args){
        int[] test1 = {3,6,2,8,5,4,1};
        selection_sort obj = new selection_sort();
        obj.selectionSort(test1);
    }
    public void selectionSort(int[] arr){
        int len = arr.length;
        for(int i=0;i<len-1;i++){
            int min = arr[i];
            int lowestIndex = i;
            for(int j=i+1;j<len;j++){
                if(arr[j]<min){
                    min = arr[j];
                    lowestIndex = j;
                }
            }
            if(i != lowestIndex){
                int temp = arr[i];
                arr[i]=arr[lowestIndex];
                arr[lowestIndex] = temp;
            }
        }
        printArray(arr);
    }
      public void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
