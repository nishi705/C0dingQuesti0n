package Array;
/*
You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

NOTE:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.
 */

public class Equilibriumindexofanarray {
    public int solve(int[] A) {
        int n = A.length;
        int count=-1;
        int ps[] = new int[n];
        ps[0] = A[0];
        for(int i=1;i<n;i++){
            ps[i] = ps[i-1] + A[i];
        }
        if(ps[n-1]==0) {
            return 0;
        }
        int suml =0;
        int sumr =0;
        for(int i=1;i<A.length;i++)
        {
            suml = ps[i-1];
            sumr = ps[n-1] - ps[i];
            if(suml==sumr){
                count=i;
            }
        }
        return count;
    }
}
