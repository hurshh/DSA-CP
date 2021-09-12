import java.io.IOException;
import java.util.ArrayList;
import java.util.SplittableRandom;

class grayCode {
    public static void main(String[] args) throws IOException {
        Reader r= new Reader();
        int n = r.nextInt();
        ArrayList<String> ans = GrayCode(n);
        StringBuilder str1 = new StringBuilder("");
        for(int i=0;i< ans.size();i++){
            String temp = ans.get(i);
            str1.append(temp);
            str1.append("\n");
        }
        System.out.println(str1);
    }

    static ArrayList<String> GrayCode(int n){
        if(n==1){
            ArrayList<String> temp1 = new ArrayList<>();
            temp1.add("0");
            temp1.add("1");
            return temp1;
        }
        ArrayList<String> previousResult = GrayCode(n-1);
        ArrayList<String> thisResult = new ArrayList<>();
        for(int i=0;i<previousResult.size();i++){
            String temp = previousResult.get(i);
            thisResult.add("0"+temp);
        }
        for(int i= previousResult.size()-1;i>=0;i--){
            String temp = previousResult.get(i);
            thisResult.add("1"+temp);
        }
        return thisResult;
    }

}




