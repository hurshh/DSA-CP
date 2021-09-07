import java.util.Scanner;

public class AlphabeticalStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-->0){
            String str = sc.nextLine();
            String alphabets = "abcdefghijklmnopqrstuvwxyz";
            boolean ans = true,Afound = false;
            int len = str.length();
            int index=0;
            int tempo = len-1;
            int alphabetINdex =1;
            for(int i=0;i<len;i++){
                if(str.charAt(i)=='a'){
                    index =i;
                    Afound = true;
                }
            }
            if(Afound == false){
                System.out.println("NO");
            }
            else{
                int leftIndex = index-1;
                int rightIndex = index+1;
                while (tempo>0){
                    if(leftIndex>=0 && str.charAt(leftIndex)==alphabets.charAt(alphabetINdex)){
                        alphabetINdex++;
                        leftIndex--;
                    }
                    else if(rightIndex<len && str.charAt(rightIndex)==alphabets.charAt(alphabetINdex)){
                        alphabetINdex++;
                        rightIndex++;
                    }
                    else{
                        ans=false;
                        break;
                    }
                    tempo--;
                }
                if(ans==false){
                    System.out.println("NO");
                }
                else {
                    System.out.println("YES");
                }
            }
        }
    }
}
