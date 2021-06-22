public class TapeEquilibrium {
    public int solution(int[] A) {
        // write your code in Java SE 11
        var sum = 0L;
        for (var a:A) {
            sum += a;
        }

        var minimumDifference = Integer.MAX_VALUE;
        var sumOfPartOne = 0L;
        for (int i = 0; i < A.length - 1; i++) {
            sumOfPartOne += A[i];
            var sumOfPartTwo = sum - sumOfPartOne;
            var difference   = Math.toIntExact(Math.abs(sumOfPartOne - sumOfPartTwo));
            if (difference < minimumDifference)
                minimumDifference = difference;
        }

        return minimumDifference;

    }

    public static void main(String[] args) {
        System.out.println(new TapeEquilibrium().solution(new int[]{3,1,2,4,3}));
        System.out.println(new TapeEquilibrium().solution(new int[]{-500,500}));
    }

}
