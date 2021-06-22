import java.util.HashSet;
import java.util.stream.IntStream;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        // write your code in Java SE 11

        var numbers = new HashSet<>();
        IntStream.rangeClosed(1, X).forEach(numbers::add);

        for (var i = 0; i < A.length; i++) {
            if (A[i] <= X) numbers.remove(A[i]);
            if (numbers.isEmpty()) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new FrogRiverOne().solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }
}
