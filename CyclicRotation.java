import java.util.Arrays;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {

        if (A.length == 0)
            return A;

        var rotated = new int[A.length];
        for (var i = 0; i < A.length; i++)
            rotated[(i + K) % A.length] = A[i];

        return rotated;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new CyclicRotation().solution(new int[]{1, 2, 3}, 2)));
    }

}
