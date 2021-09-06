package recursive;

public class r5 {
    public static void main(String[] args) {
        printSpelling("009",0);
        System.out.println();
        printSpelling2(100);
    }
    static void printSpelling(String str,int index){
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(index == str.length()){
            return;
        }
        int a = Integer.parseInt(String.valueOf(str.charAt(index)));
        System.out.print(arr[a]+" ");
        printSpelling(str,index+1);
    }

    static void printSpelling2(int n){
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        if(n==0){
            return;
        }
        printSpelling2(n/10);
        System.out.print(arr[n%10]+" ");
    }
}
