import java.util.*;
import java.util.function.ToIntFunction;

class rough{
    public static void main(String[] args) {
        ArrayList<rand1> arr =new ArrayList<>();
        arr.add(new rand1(1,2));
        arr.add(new rand1(1,1));
        arr.add(new rand1(1,5));
        arr.add(new rand1(1,3));
        custcomp c1 = new custcomp();
        Collections.sort(arr,c1);
        for(rand1 temp : arr){
            System.out.println(temp.i2);
        }
    }
}
class rand1{
    int i1;
    int i2;

    public rand1(int i1, int i2) {
        this.i1 = i1;
        this.i2 = i2;
    }
}

class custcomp implements Comparator<rand1>{
    @Override
    public int compare(rand1 o1, rand1 o2) {
        if(o1.i1> o2.i1){
            return 1;
        }
        if(o1.i1== o2.i1 && o1.i2> o2.i2){
            return 1;
        }
        return -1;
    }
}