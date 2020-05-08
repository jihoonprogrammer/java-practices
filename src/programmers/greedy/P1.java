package programmers.greedy;

import java.util.Arrays;

//https://programmers.co.kr/learn/courses/30/lessons/42862
public class P1 {
    public static int solution(int n, int[] lost, int[] reserve){
        int[] students = new int[n];
        for (int i=0; i<lost.length; i++){
            students[lost[i]-1]--;
        }
        for (int i=0; i<reserve.length; i++){
            students[reserve[i]-1]++;
        }
        for (int i=0; i<students.length; i++){
            if (students[i] < 0){
                if (i-1 > 0 && students[i-1] > 0){
                    students[i] = 0;
                    students[i-1] = students[i-1] - 1;
                } else if (i+1 < students.length && students[i+1] > 0){
                    students[i] = 0;
                    students[i + 1] = students[i+1] -1;
                }
            }
        }
        int answer = 0;
        for (int i=0; i<students.length; i++){
            if (students[i] >= 0){
                answer++;
            }
        }
        return answer;
    }

    public static void print(){
        int n=3;
        int[] lost = {3};
        int[] reserve = {1};
        solution(n, lost, reserve);
    }
}
