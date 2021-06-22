import java.util.stream.IntStream;

public class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 11
        boolean[] seen = new boolean[1_000_001];
        for (int a : A) {
            if (a <= 0)
                continue;
            seen[a] = true;
        }
        for (int i = 1; i < seen.length; i++) {
            if (!seen[i])
                return i;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(new MissingInteger().solution(new int[]{1, 3, 6, 4, 1, 2}));
        System.out.println(new MissingInteger().solution(new int[]{1, 2, 3}));
        System.out.println(new MissingInteger().solution(new int[]{-1, -3, 2, 3, 5}));
        System.out.println(new MissingInteger().solution(new int[]{-1, -3}));
        System.out.println(new MissingInteger().solution(new int[]{}));
        System.out.println(new MissingInteger().solution(new int[]{0}));
        System.out.println(new MissingInteger().solution(new int[]{1}));
        System.out.println(new MissingInteger().solution(new int[]{2}));
        System.out.println(new MissingInteger().solution(new int[]{3}));
        System.out.println(new MissingInteger().solution(IntStream.range(1,1_000_000).toArray()));
    }
}
