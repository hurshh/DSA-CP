//https://leetcode.com/explore/challenge/card/july-leetcoding-challenge-2021/609/week-2-july-8th-july-14th/3811/

public class    isomorphic_string {
    public static void main(String[] args){
        String s ="paper", t = "title";
        System.out.println(isIsomorphic(s,t));
    }
//    public static boolean isIsomorphic (String s, String t){
//        boolean answer = true;
//        if(s.length() != t.length()){
//            return false;
//        }
//        else{
//            for(int i =0;i<s.length();i++){
//                for(int j=i+1;j<s.length();j++){
//                    if(s.charAt(i)== s.charAt(j) && t.charAt(i) != t.charAt(j) || s.charAt(i)!= s.charAt(j) && t.charAt(i) == t.charAt(j)){
//                        answer = false;
//                    }
//                }
//            }
//        }
//        return answer;
//    }
    public static boolean isIsomorphic(String s, String t){
        int n = s.length();
        int m = t.length();
        if(n!=m){
            return false;
        }
        int[] recordS = new int[256];
        int[] recordT = new int[256];
        int label=1;
        for(int i=0;i<n;i++){
            int charS = s.charAt(i);
            int charT = t.charAt(i);
            if(recordS[charS] != recordT[charT]){
                return false;
            }
            if(recordS[charS] ==0 && recordT[charT]==0){
                recordS[charS] = label;
                recordT[charT] = label;
                label++;
            }
        }
        return true;
    }

}
