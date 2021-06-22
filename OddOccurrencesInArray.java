public class OddOccurrencesInArray {
    public int solution(int[] A) {
        // write your code in Java SE 11
        var remainder = 0;
        for (var a : A)
            remainder ^= a;

        return remainder;
    }

    public static void main(String[] args) {
        System.out.println(new OddOccurrencesInArray().solution(new int[]{1, 2, 3, 1, 2}));
    }

}
