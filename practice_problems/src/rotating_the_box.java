//   https://leetcode.com/problems/rotating-the-box/


public class rotating_the_box {
    public static void main(String[] args){
        char[][] box = {{'#', '.', '#'}};
        rotateTheBox(box);
    }
    public static char[][] rotateTheBox(char[][] box){
        char[][] answer = new char[box[0].length][box.length];
        for (int i=0;i< box.length;i++){
            for (int j=box[0].length-1;j>=0;j--){
                if(box[i][j] == '#'){
                    int empty = j+1;
                    while (empty<box[0].length && box[i][empty] == '.'){
                        empty++;
                    }
                    if(empty<box[0].length && box[i][empty]=='.'){
                        box[i][empty] = '#';
                        box[i][j] = '.';
                    }
                    else if(empty-1<box[0].length && box[i][empty-1] == '.'){
                        box[i][empty-1] = '#';
                        box[i][j] = '.';
                    }
                }
            }
        }
        for (int i=0;i< box.length;i++){
            for (int j=0;j<box[0].length;j++){
                answer[j][box.length - i - 1] = box[i][j];
            }
        }
        return answer;
    }
}
