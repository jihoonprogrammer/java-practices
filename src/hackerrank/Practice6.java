package hackerrank;
//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen

public class Practice6 {
    public static int solution(int []c){
        int index = 0;
        int answer = 0;
        while (index != c.length-1){
            if (index+2 < c.length && c[index + 2] == 0){
                index = index + 2;
            }
            else{
                index = index + 1;
            }
            answer++;
        }
        return answer;
    }
}
