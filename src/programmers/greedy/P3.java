package programmers.greedy;

import java.util.Stack;

//https://programmers.co.kr/learn/courses/30/lessons/42883
public class P3 {
    //my solution, it's not good
    public static String solution(String number, int k){
        int length = number.length() - k;
        int max = 0;
        int start = 0;
        StringBuilder sb = new StringBuilder();
        while (length > 0){
            for (int i=0; i<number.length(); i++){
                if (i == start){
                    int val = Integer.parseInt(Character.toString(number.charAt(i)));
                    max = val;
                    for (int j=i+1; j<number.length(); j++){
                        int val2 = Integer.parseInt(Character.toString(number.charAt(j)));
                        if (val2 > max && number.substring(j, number.length()).length() >= length){
                            start = j;
                            max = val2;
                        }
                    }
                    length--;
                    start++;
                    sb.append(max);
                }
            }
        }
        return sb.toString();
    }

    //using stack
    public static String solution2(String number, int k){
        char[] result = new char[number.length() - k];
        Stack<Integer> stack = new Stack<>();

        System.out.println("starting k: "+k);
        for (int i=0; i<number.length(); i++){
            int c = Integer.parseInt(Character.toString(number.charAt(i)));
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0){
                stack.pop();
            }
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Integer integer: stack){
            sb.append(integer);
        }
        return sb.toString();
    }

    //another solution
    public static String solution3(String number, int k){
        StringBuilder sb = new StringBuilder(number);
        for (int i=0; i<number.length(); i++){
            if (k == 0) break;
            if (sb.charAt(i) < sb.charAt(i + 1)){
                sb.deleteCharAt(i);
                i = -1;
                k--;
            }
        }
        return sb.toString();
    }

    //my review
    public static String solution4(String number, int k){
        Stack<Character> stack = new Stack<>();
        char[] result = new char[number.length() - k];
        for (int i=0; i<number.length(); i++){
            char c = number.charAt(i);
            while (!stack.isEmpty() && stack.peek() < c && k-- > 0){
                stack.pop();
            }
            stack.push(c);
        }
        //instead of using stack.size(), use result.length..
//        for (int i=0; i<stack.size(); i++){
//            result[i] = stack.get(i);
//        }
        for (int i=0; i<result.length; i++){
            result[i] = stack.get(i);
        }
        return new String(result);
    }

    public static void print(){
        String number = "4177252841";
        int k = 4;
        solution4(number, k);
    }
}
