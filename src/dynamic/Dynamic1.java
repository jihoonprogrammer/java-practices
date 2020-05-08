package dynamic;

import java.util.Arrays;

public class Dynamic1 {
    private long[] d;

    public Dynamic1(int d){
        this.d = new long[d];
    }

    //d 라는 메모리에다 구한 피보나치 숫자를 집어넣어놓은뒤 써야할때 다시씀
    public long fib(int x){
        if (x == 1){
            return 1;
        }
        if (x == 2){
            return 1;
        }
//        System.out.println(Arrays.toString(d));
        if (this.d[x] != 0){
            return d[x];
        }
        return d[x] = fib(x-1) + fib(x-2);
    }

    public long fibWODP(int x){
        if (x == 1){
            return 1;
        }
        if (x == 2){
            return 2;
        }
        return fibWODP(x - 1) + fibWODP(x - 2);
    }
}
