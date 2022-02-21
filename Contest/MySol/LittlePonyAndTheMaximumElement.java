package Contest;

public class LittlePonyAndTheMaximumElement {
    public static int searchelement(int[] A,int B)
    {
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==B)
            {
                return 1;
            }
        }
        return -1;
    }

    public int solve(int[] A, int B) {
        int n = searchelement(A,B);
        int count=0;

        if(n==1)
        {
            for(int i=0;i<A.length;i++){
                if(A[i]>B)
                {
                    count++;
                }
                else
                {
                    continue;
                }
            }
            return count;
        }
        return -1;
    }
}
