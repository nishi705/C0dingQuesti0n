package Contest;

public class CompleteSolutionMinimumPic {

    public int solve(int[] A)
    {
        int maxx = Integer.MIN_VALUE, minn = Integer.MAX_VALUE;

        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2 == 0)
                maxx = Math.max(A[i],maxx);
            else
                minn = Math.min(A[i],minn);
        }
        return maxx-minn;
    }
}
