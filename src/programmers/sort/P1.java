package programmers.sort;

import java.util.Arrays;

public class P1 {
    //my solution
    public static int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];

        for (int row=0; row<commands.length; row++){
            int i = commands[row][0];
            int j = commands[row][1];
            int k = commands[row][2];
            int[] temp = new int[j - i + 1];
            int index = 0;
            for (int x=i-1; x<j; x++){
                temp[index] = array[x];
                index++;
            }
            Arrays.sort(temp);
            answer[row] = temp[k-1];
        }
        return answer;
    }

    //another solution using copyOfRange
    public static int[] solution2(int[] array, int[][] commands){
        int[] answer = new int[commands.length];
        for (int row=0; row<commands.length; row++){
            int[] temp = Arrays.copyOfRange(array, commands[row][0]-1, commands[row][1]);
            Arrays.sort(temp);
            answer[row] = temp[commands[row][2]-1];
        }
        return answer;
    }

    public static void print(){
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {
                {2,5,3},
                {4,4,1},
                {1,7,3}
        };
        solution2(array, commands);
    }
}
