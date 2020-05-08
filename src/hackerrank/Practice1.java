package hackerrank;

import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/compare-the-triplets/problem
public class Practice1 {


    public static void test(){
        List<Integer> alice = new ArrayList<>();
        List<Integer> bob = new ArrayList<>();
        List<Integer> scores = new ArrayList<>();
        scores.add(0);
        scores.add(0);
        alice.add(17);
        alice.add(28);
        alice.add(30);
        bob.add(99);
        bob.add(16);
        bob.add(7);

        for (int i=0; i<alice.size(); i++){
            if (alice.get(i) > bob.get(i)){
                scores.set(0, scores.get(0) + 1);
            } else{
                scores.set(1, scores.get(1) + 1);
            }
        }
        System.out.println(scores);
    }
}
