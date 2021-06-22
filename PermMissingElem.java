public class PermMissingElem {
    public int solution(int[] A) {
        // write your code in Java SE 11
        var sum = 0L;
        var max = 0L;
        for (var a : A) {
            sum += a;
            if (a > max)
                max = a;
        }
        var difference = max * (1 + max) / 2 - sum;
        if (difference == 0) max++;
        return Math.toIntExact(max * (1 + max) / 2 - sum);
    }

    public static void main(String[] args) {
        System.out.println(new PermMissingElem().solution(new int[]{1}));
    }

}
