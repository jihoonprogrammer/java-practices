package hackerrank.interview_preps.warm_up;
//https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
public class P2 {
    public static int solution(int n, String s){
        int level = 0;
        int answer = 0;
        for (char c: s.toCharArray()){
            if (c == 'U'){
                level++;
                if (level == 0){
                    answer++;
                }
            } else{
                level--;
            }
        }
        return answer;
    }

    public static void print(){
        int n = 8;
        String s = "UDDDUDUU";
        int answer = solution(8, s);
        System.out.println(answer);
    }
}
