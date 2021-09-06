import java.io.IOException;

public class grayCode {
    public static void main(String[] args) throws IOException {
        Reader r= new Reader();
        int n = r.nextInt();
        System.out.println(intToBinary(n));
    }
    public static StringBuilder intToBinary(int n){
        StringBuilder answer = new StringBuilder();
        int powOf2 = (int) Math.pow(2,n);
        for(int i=0;i<powOf2;i++){
            StringBuilder tempStr = new StringBuilder();
            int tempInt = i;
            for(int j=0;j<n;j++){
                tempStr.append(tempInt%2);
                tempInt /=2;
            }
            answer.append(tempStr.reverse());
            answer.append("\n");
        }
        return answer;
    }
}


