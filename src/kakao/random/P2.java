package kakao.random;

public class P2 {
    public static void printStar(int a, int b){
        for (int row=0; row<b; row++){
            for (int col=0; col<a; col++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
