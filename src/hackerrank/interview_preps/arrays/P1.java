package hackerrank.interview_preps.arrays;
//https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

public class P1 {
    public static int solution(int[][] arr){
        int answer = 0;
        int max = Integer.MIN_VALUE;
        int x = 0;
        int y = 0;
        while(true){
            int calculated = 0;
            for (int i=x; i<x+3; i++){
                for (int j=y; j<y+3; j++){
                    if (i < arr.length && j < arr[0].length){
                        if (i == x + 1 && j == y || i == x + 1 && j == y + 2) continue;
                        calculated += arr[i][j];
                    }
                }
            }
            if (calculated > max){
                max = calculated;
            }
            y++;
            if (arr.length - x < 3 && arr.length -y < 3){
                break;
            }
            if (arr.length - y < 3){
                x++;
                y = 0;
            }
        }
        return max;
    }

    public static void print(){
        int[][] arr = {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0}};
        int[][] arr2 = {
                {-9,-9,-9,1,1,1},
                {0,-9,0,4,3,2},
                {-9,-9,-9,1,2,3},
                {0,0,8,6,6,0},
                {0,0,0,-2,0,0},
                {0,0,1,2,4,0}
        };
        int answer = solution(arr2);
    }
}
