//https://leetcode.com/problems/next-permutation/

public class nextPermutation {
    public static void main(String[] args){
        solution s1 = new solution();
        s1.arr = new int[]{1, 2, 3, 4};
        int[] test2 = {3,2,1};
        s1.nextpermutation(s1.arr);
        s1.printArraty(s1.arr);
        s1.nextpermutation(test2);
        s1.printArraty(test2);
    }
}
class solution{
    int[] arr;
    public void nextpermutation ( int[] arr){
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
    public void swap ( int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void reverseArray ( int[] arr, int start){
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public void printArraty(int[] arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
