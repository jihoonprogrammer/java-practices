package programmers.hash;

public class P2 {
    public static void main(String[] args){
        String[] phone_book = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123", "456", "789"};
        solution(phone_book);
    }

    public static boolean solution(String[] phone_book){
        boolean answer = true;
        for (int i=0; i<phone_book.length; i++){
            for (int j=i+1; j<phone_book.length; j++){
                if (phone_book[i].length() > phone_book[j].length()){
                    if (phone_book[i].substring(0, phone_book[j].length()).equals(phone_book[j])){
                        answer = false;
                        break;
                    }
                } else if (phone_book[i].length() < phone_book[j].length()){
                    if (phone_book[j].substring(0, phone_book[i].length()).equals(phone_book[i])){
                        answer = false;
                        break;
                    }
                } else{
                    if (phone_book[i].equals(phone_book[j])){
                        answer = false;
                        break;
                    }
                }
            }
        }
        return answer;
    }

    //my attempt using hash
    public static boolean solution2(String[] phone_book){
        boolean answer = true;

        return answer;
    }
}
