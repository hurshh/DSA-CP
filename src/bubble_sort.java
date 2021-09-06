//day1
public class bubble_sort {
    void bubbleSort(int[] arr){
        int len = arr.length;
        for(int i=len-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);
    }
    void optimizedBubbleSort(int[] arr){
        int len = arr.length;
        for(int i=len-1;i>0;i--){
            boolean swapped = false;
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        printArray(arr);
    }
    void recursiveBubbleSort(int[] arr,int n){
        if(n==1){
            return;
        }
        for(int j = 0;j < n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        recursiveBubbleSort(arr,n-1);
    }
    void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        bubble_sort ob = new bubble_sort();
        int[] test1 = {1,8,6,3,7,4,2,0};
        int[] test2 = {1,2,3,4,5,6,7,8};
//        ob.bubbleSort(test1);
//        ob.optimizedBubbleSort(test1);
//        ob.optimizedBubbleSort(test2);
        ob.recursiveBubbleSort(test1, test1.length);
        ob.printArray(test1);
    }
}
