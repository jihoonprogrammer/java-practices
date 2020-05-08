package hackerrank;
//https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup

import java.util.HashMap;

public class Practice4 {

    public static int solution(int n, int[] arr){
        int answer = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int a: arr){
            hm.put(a, hm.getOrDefault(a, 0) + 1);
        }
        for (int a : hm.values()){
            answer += a/2;
        }
        return answer;
    }
}
