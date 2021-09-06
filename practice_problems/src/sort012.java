public class sort012 {
    public static void main(String[] args){
        int[] test1 = {1,0,0,2,1,2,0,2,1,2};
        Sort012(test1);
        printArray(test1);
    }
    public static void Sort012(int[] array){
        int zeroes=0, ones=0, twos=0,index=0;
        for(int i=0;i< array.length;i++){
            if(array[i] == 0){
                zeroes++;
            }
            if(array[i] == 1){
                ones++;
            }
            if(array[i] == 2){
                twos++;
            }
        }
        while (zeroes-- !=0){
            array[index] =0;
            index++;
        }
        while (ones-- !=0){
            array[index] =1;
            index++;
        }
        while (twos-- !=0){
            array[index] =2;
            index++;
        }
    }
    public static void printArray(int[] arr){
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
