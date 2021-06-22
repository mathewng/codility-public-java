public class PermCheck {
    public int solution(int[] A) {
        boolean[] seen = new boolean[A.length + 1];
        seen[0] = true;
        
        for (var a : A) {
            // out of range numbers that are too high
            if (a >= seen.length)
                return 0;
            //seen and appearing again
            if (seen[a]) return 0;
            // if not seen, mark seen
            else seen[a] = true;
        }
        // return 0 if there are missing numbers.
        for (var s : seen) if (!s) return 0;

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(new PermCheck().solution(new int[]{1}));
        System.out.println(new PermCheck().solution(new int[]{2}));
        System.out.println(new PermCheck().solution(new int[]{4,1,3,2}));
        System.out.println(new PermCheck().solution(new int[]{4,1,3,2,4}));
        System.out.println(new PermCheck().solution(new int[]{4,1,3}));
    }
}
