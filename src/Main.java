import greedy.GreedyPractice1;
import greedy.GreedyPractice2;
import greedy.GreedyPractice3;
import dynamic.Dynamic1;
import hackerrank.*;
import kakao.*;

public class Main {
    public static void main(String[] args){
        Practice7();
    }

    public static void kakao1(){
        int k = 3;
        int[] stones = {2, 4, 5, 3, 2, 1, 4, 2, 5, 1};
        Kakao1.solution(stones, k);
    }

    public static void Practice1(){
        Practice1.test();
    }

    public static void Practice2(){
        Practice2.solution();
    }

    public static void Practice3(){
        Practice3.solution();
    }

    public static void Practice4(){
        int n = 9;
        int[] arr = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        Practice4.solution(n, arr);
    }

    public static void Practice5(){
        int n = 8;
        String s = "UUDDUUDDUUDDUU";
        Practice5.solution(n, s);
    }

    public static void Practice6(){
        int n = 6;
        int[] clouds = {0,0,0,0,1,0};
        Practice6.solution(clouds);
    }

    public static void Practice7(){
        long n = 1000000000000L;
        String s = "a";
        Practice7.repeatedString(n, s);
    }

}
