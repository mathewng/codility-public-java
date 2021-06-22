import java.util.Arrays;
import java.util.stream.IntStream;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        var counters = new int[N];

        var base = 0;
        var max  = 0;
        for (var a : A) {
            // do max counter
            if (a == N + 1) base = max;
            else {
                // do increase(X)
                if (counters[a - 1] < base) counters[a - 1] = base;
                counters[a - 1]++;
                if (counters[a - 1] > max) max = counters[a - 1];
            }
        }
        for (var i = 0; i < counters.length; i++)
            if (counters[i] < base) counters[i] = base;
        return counters;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MaxCounters().solution(5, new int[]{3, 4, 4, 6, 1, 4, 4})));
        System.out.println(Arrays.toString(new MaxCounters().solution(100000, IntStream.generate(()-> {
            if (Math.random() < 0.5)
                return 100001;
            else
                return (int) (Math.random() * 99999) + 1;
        }).limit(100000).toArray())));
    }
}
