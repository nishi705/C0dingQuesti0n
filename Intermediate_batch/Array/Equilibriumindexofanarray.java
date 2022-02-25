package Array;

public class Equilibriumindexofanarray {
    public int solve(int[] A) {
        int n = A.length;
        int count = -1;
        int ps[] = new int[n];
        ps[0] = A[0];
        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + A[i];
        }
        if (ps[n - 1] == 0) {
            return 0;
        }
        int suml = 0;
        int sumr = 0;
        for (int i = 1; i < A.length; i++) {
            suml = ps[i - 1];
            sumr = ps[n - 1] - ps[i];
            if (suml == sumr) {
                count = i;
            }
        }
        return count;
    }
}
