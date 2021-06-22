

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 11
        return (Y - X) / D + ((Y - X) % D > 0 ? 1 : 0);
    }

    public static void main(String[] args) {
        System.out.println(new FrogJmp().solution(10, 85, 30));
    }

}
