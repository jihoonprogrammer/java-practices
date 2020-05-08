package hackerrank.interview_preps.warm_up;

public class P4 {
    public static long solution(String s, long n){
        long answer = 0;
        long divided = n/s.length();
        long remainder = n % s.length();
        long aCount = 0;

        for (char c: s.toCharArray()){
            if (c == 'a'){
                aCount++;
            }
        }

        aCount *= divided;
        if (remainder > 0){
            for (int i=0; i<remainder; i++){
                if (s.charAt(i) == 'a'){
                    aCount++;
                }
            }
        }
        return aCount;
    }

    public static void print(){
        String s = "aba";
        long n = 10;
        long answer = solution(s, n);
        System.out.println(answer);
    }
}

