import java.util.*;

public class rough {
//    public static void main(String[] args) {
//        String str = "Now is the time for all men to come to improve our country";
//        int i=0;
//        while(true){
//            int first = str.indexOf("Now",i);
//            if(first == -1)
//                break;
//            int start = first +3;
//            int end = str.lastIndexOf(" ",start);
//            System.out.println(end);
//            i = end+1;
//        }
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int seconds = sc.nextInt();
    int hours = seconds/3600;
    int minutes = seconds/60;
    minutes %= 60;
    seconds%= 60;
    System.out.println(hours+":"+minutes+":"+seconds);
}

}
