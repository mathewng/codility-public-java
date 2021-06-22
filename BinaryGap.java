class BinaryGap {
    public int solution(int N) {
        // write your code in Java SE 11

        var     longestBinaryGap = 0;
        var     binaryGap        = 0;
        var counting         = false;

        for (var i = N; i > 0; i >>= 1) {
            var isLowestDigitZero = (i & 1) == 0;
            if (isLowestDigitZero) {
                if (counting)
                    binaryGap++;
            } else {
                if (binaryGap > longestBinaryGap)
                    longestBinaryGap = binaryGap;
                binaryGap = 0;
                counting  = true;
            }
        }

        return longestBinaryGap;
    }

    public static void main(String[] args) {
        System.out.println(new BinaryGap().solution(123123));
    }
}
