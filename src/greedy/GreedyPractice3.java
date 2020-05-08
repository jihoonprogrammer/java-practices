package greedy;

public class GreedyPractice3 {
    public int solution(int price){
        price = 1680;
        int leftOver = 0;
        int result = 0;
        result += price / 500;
        leftOver = leftOver + price % 500;
        return price;
    }
}
