public class mergeWithoutExtraSpace {
    public static void main(String[] args){
        int[] testa = {1, 3, 5, 7};
        int[] testb = {0, 2, 6, 8, 9};
        solves2 s1 = new solves2();
        s1.merge(testa,testb,4,5);
    }
}
class solves2{
    public void merge(int[] arr1,int[] arr2,int n,int m){
        int i=0,j=0,lol = n+m;
        while(lol-->0){
            if(i<n && j<m){
                if (arr1[i] <= arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    i++;
                } else {
                    System.out.print(arr2[j] + " ");
                    j++;
                }
            }
            else {
                if(i==n && j<m){
                    System.out.print(arr2[j] + " ");
                    j++;
                }
                else{
                    if(j==n && i<n){
                        System.out.print(arr1[i] + " ");
                        i++;
                    }
                }
            }
        }
    }
}
