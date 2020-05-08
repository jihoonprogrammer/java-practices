//https://programmers.co.kr/learn/courses/30/lessons/42862
package greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GreedyPractice1 {

    //이건 내가 한
    public int solution(int n, int[] lost, int[] reserve){
        int answer = n;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i<n; i++){
            hm.put(i+1, 1);
        }
        for (int l: lost){
            hm.put(l, hm.get(l) -1);
        }
        for (int r: reserve){
            hm.put(r, hm.get(r) + 1);
        }
        for (Map.Entry<Integer, Integer> person: hm.entrySet()){
            if (person.getValue() == 0){
                if (hm.get(person.getKey()-1) != null && hm.get(person.getKey() -1) > 1){
                    hm.put(person.getKey(), 1);
                    hm.put(person.getKey() -1, hm.get(person.getKey()-1) -1);
                }
                else if (hm.get(person.getKey() +1) != null  && hm.get(person.getKey() + 1) > 1){
                    hm.put(person.getKey(), 1);
                    hm.put(person.getKey() + 1, hm.get(person.getKey() + 1) -1);
                }
                else{
                    answer--;
                }
            }
        }
        return answer;
    }

    //다른 사람이 한거
    public int solution2(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] people = new int[n];
        for (int l: lost){
            people[l-1]--;
        }
        for (int r: reserve){
            people[r-1]++;
        }
        for (int i=0; i<people.length; i++){
            if (people[i] == -1){
                if (i-1>=0 && people[i-1] == 1){
                    people[i]++;
                    people[i-1]--;
                }else if (i+1<people.length && people[i+1] == 1){
                    people[i]++;
                    people[i+1]--;
                }else{
                    answer--;
                }
            }
        }
        return answer;
    }
}
