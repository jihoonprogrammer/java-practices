package kakao.random;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P1 {
    public static int[] solution(int[][] v){
        HashMap<Integer, Integer> hmX = new HashMap<>();
        HashMap<Integer, Integer> hmY = new HashMap<>();
        int x = 0;
        int y = 0;
        int[] coordinate = new int[2];
        for (int i=0; i<v.length; i++){
            int xVal = v[i][0];
            int yVal = v[i][1];
            hmX.put(xVal, hmX.getOrDefault(xVal, 0) + 1);
            hmY.put(yVal, hmY.getOrDefault(yVal, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> eX: hmX.entrySet()){
            if (eX.getValue() < 2){
                x = eX.getKey();
            }
        }

        for (Map.Entry<Integer, Integer> eY: hmY.entrySet()){
            if (eY.getValue() < 2){
                y = eY.getKey();
            }
        }
        coordinate[0] = x;
        coordinate[1] = y;
        return coordinate;
    }

    public static void print(){
        int[][] v = {
                {1,4},
                {3,4},
                {3,10}
        };
        solution(v);
    }
}

