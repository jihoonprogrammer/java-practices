//https://programmers.co.kr/learn/courses/30/lessons/64062

package kakao;

public class Kakao1 {
    public static int solution(int[] stones, int k){
        int left = 1;
        int right = Integer.MAX_VALUE;
        int max = 0;

        while (left <= right){
            //some big number
            int mid = (left / 2) + (right / 2);
            System.out.println("left: "+left);
            System.out.println("right: " +right);
            System.out.println("mid: " +mid);
            int cnt = 0;
            for (int i: stones){
                //if i - mid is less than 0, add 1 to cnt, else cnt is zero
                cnt = (i - mid) < 0 ? cnt + 1 : 0;
                System.out.println("index: "+ i + "cnt: " +cnt);
                if (cnt == k) break;
            }
            System.out.println("------");
            if (cnt < k){
                left = mid + 1;
                max = Math.max(max, mid);
            }
            else right = mid - 1;
        }
        System.out.println(max);
        return max;
    }
}
