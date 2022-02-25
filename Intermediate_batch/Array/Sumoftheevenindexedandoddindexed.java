package Array;

public class Sumoftheevenindexedandoddindexed {
    public static void main(String[] args) {


        int[] A = {4,3,2,7,6,-2};
            int n = A.length;
            int[] pse = new int[n];
            pse[0] = A[0];
            for (int i = 1; i < n; i++) {
                if (i % 2 == 0) {
                    pse[i] = pse[i - 1] + A[i];
                } else {
                    pse[i] = pse[i - 1];
                }
            }

            //PS for odd indexed:
            int[] pso = new int[n];
            pso[0] = A[1];
            pso[1] = A[1];
            for (int i = 2; i < n; i++) {
                if (i % 2 == 1) {
                    pso[i] = pso[i - 1] + A[i];
                } else {
                    pso[i] = pso[i - 1];
                }
            }
        }

}
