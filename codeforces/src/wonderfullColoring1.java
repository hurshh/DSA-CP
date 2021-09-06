import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class wonderfullColoring1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str = sc.nextLine();
            char strArray[] = str.toCharArray();
            Arrays.sort(strArray);
            long count =1,painted=0,nonPainted=0,notSure=0;
            for(int i=0;i< strArray.length;i++){
                if(i== strArray.length-1){
                    if(count==1){
                        notSure++;
                    }
                    if(count==2){
                        painted++;
                    }
                    if(count>2){
                        painted++;
                        nonPainted=(count-2);
                    }
                }
                else {
                    if(strArray[i]==strArray[i+1]){
                        count++;
                    }
                    else{
                        if(count==1){
                            notSure++;
                        }
                        if(count==2){
                            painted++;
                        }
                        if(count>2){
                            painted++;
                            nonPainted=(count-2);
                        }
                        count=1;
                    }
                }
            }
            painted += notSure/2;
            if(notSure%2!=0){
                nonPainted++;
            }
            System.out.println(painted);
        }
    }
}

