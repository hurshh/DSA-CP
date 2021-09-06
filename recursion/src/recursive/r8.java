package recursive;

import java.util.ArrayList;

public class r8 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=1;i<=3;i++){
            arr.add(i);
        }

        printPowerset(arr2,arr,0);
        System.out.println("-----------------------");
    }
    static void printPowerset(ArrayList<Integer> arr, ArrayList<Integer> Qarr, int index){
        if(index == Qarr.size()){
            printArray(arr);
        }
        else {
            //add element from given set
            arr.add(Qarr.get(index));
            printPowerset(arr,Qarr,index+1);
            //removing element added
            arr.remove(arr.size()-1);
            printPowerset(arr,Qarr,index+1);
        }
    }
    static void printArray(ArrayList<Integer> arr){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
