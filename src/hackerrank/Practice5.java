package hackerrank;

public class Practice5 {

    public static int solution(int n, String s){
        int seaLevel = 0;
        int answer = 0;
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == 'U'){
                seaLevel++;
            } else{
                seaLevel--;
            }
            if (seaLevel == 0 && s.charAt(i) == 'U'){
                answer++;
            }
        }
        return answer;
    }
}
