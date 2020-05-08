package hackerrank.interview_preps.warm_up;

//https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class P3 {
    public static int solution(int[] clouds){
        int answer = 0;
        int i = 0;

        while (i < clouds.length-1){
            if ((i+2 < clouds.length) && clouds[i + 2] == 0){
                i = i + 2;
            } else{
                i = i + 1;
            }
            answer++;
        }
        return answer;
    }

    public static void print(){
        int n = 6;
        int[] clouds = {0, 0, 0, 0, 1, 0};
        int answer = solution(clouds);
        System.out.println(answer);
    }
}
