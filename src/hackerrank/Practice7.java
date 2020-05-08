package hackerrank;
import java.util.HashMap;

//https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
//question - if n is 10 and s is aba, then fill up n amount of string with aba. ends up with "abaabaabaa". count total a's.

//first find how many times the string can be dived into n
//if string length is 3, and n is 10, then there would be total 3 times where the string can be fitted into n 10.

//second find leftover. since total of 3 times can be used to put the string. it would be 10 - 3*3, leaving us with 1.

//third, check if the leftover has any a's. if we find a's, then add it to aCount
public class Practice7 {
    public static long repeatedString(long n, String s){
        long answer = 0;
        long count = n/s.length();
        long leftOver = n % s.length();
        long aCount = 0;

        for (char c: s.toCharArray()){
            if (c == 'a'){
                aCount++;
            }
        }
        aCount *= count;
        if (leftOver > 0){
            for (int i=0; i<leftOver; i++){
                if (s.charAt(i) == 'a'){
                    aCount++;
                }
            }
        }
        System.out.println(aCount);
        return aCount;
    }
}
