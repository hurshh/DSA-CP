import java.io.IOException;

public class XXOR {
    public static void main(String[] args) throws IOException {
        fastr rdr= new fastr();
        int n = rdr.nextInt();
        int q = rdr.nextInt();
        String[] binArr = new String[n];
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<n;i++){
            int temp = rdr.nextInt();
            StringBuilder binaryString = new StringBuilder(Integer.toBinaryString(temp));
            for(int j=binaryString.length();j<31;j++){
                binaryString.insert(0,"0");
            }
            binArr[i] = binaryString.toString();
        }
        while (q-->0){
            int l = rdr.nextInt();
            int r = rdr.nextInt();
            StringBuilder res = new StringBuilder();
            for(int i=0;i<31;i++){
                int zeroCounter=0;
                int oneCounter=0;
                for(int j=l-1;j<r;j++){
                    if(binArr[j].charAt(i) == '0'){
                        zeroCounter++;
                    }
                    else {
                        oneCounter++;
                    }
                }
                if(zeroCounter>oneCounter){
                    res.append("1");
                }
                else {
                    res.append("0");
                }
            }
            ans.append(Integer.parseInt(res.toString(),2)).append(" ");
        }
        System.out.println(ans);
    }
}
