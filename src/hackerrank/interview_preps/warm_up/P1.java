package hackerrank.interview_preps.warm_up;

import java.util.HashMap;

public class P1 {
    public static int solution(int n, int[] socks){
        int answer = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int sock: socks){
            hm.put(sock, hm.getOrDefault(sock, 0) + 1);
        }
        for (int val: hm.values()){
            answer += val / 2;
        }
        return answer;
    }

    public static void print(){
        int n = 9;
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int answer = solution(n, socks);
        System.out.println(answer);
    }
}
