package recursive;

public class r7 {
    public static void main(String[] args) {
        int [] test1 ={1,2,3,4,5,6};
        int[] test2 = {2,3,1,5,1};
        System.out.println(checkSorted(test1,1));
        System.out.println(checkSorted(test2,1));
    }
    static boolean checkSorted(int[] arr,int index){
        if(index == arr.length){
            return true;
        }
        if(arr[index-1] > arr[index]){
            return false;
        }
       return checkSorted(arr,index+1);

    }
}
