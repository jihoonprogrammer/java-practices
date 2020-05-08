package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {
    public static void solution(){
        int[] arr = {-4, 3, -9, 0, 4, 1};
        float positive = 0;
        float negative = 0;
        float zero = 0;
        for (int a: arr){
            if (a == 0){
                zero++;
            } else if (a > 0){
                positive++;
            } else{
                negative++;
            }
        }
        System.out.println(positive/arr.length);
        System.out.println(negative/arr.length);
        System.out.println(zero/arr.length);
    }
}
