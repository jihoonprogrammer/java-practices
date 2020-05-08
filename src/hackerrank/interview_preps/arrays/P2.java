package hackerrank.interview_preps.arrays;

import java.util.Arrays;

//https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
public class P2 {
    public static void solution(int[] a, int d){
        int[] temp = new int[d];
        int[] newArr = new int[a.length];
        for (int i=0; i<d; i++){
            temp[i] = a[i];
        }
        for (int i=0; i<a.length-d; i++){
            newArr[i] = a[d + i];
        }
        for (int i=0; i<temp.length; i++){
            newArr[a.length - d + i] = temp[i];
        }
    }

    public static void print(){
        int d = 4;
        int[] a = {1, 2, 3, 4, 5};
        solution(a, d);
    }
}
