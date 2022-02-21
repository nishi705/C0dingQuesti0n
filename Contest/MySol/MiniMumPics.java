package Contest;

public class MiniMumPics {
            public int solve(int[] A) {
                int min = Integer.MAX_VALUE;//for  number
                int max = Integer.MIN_VALUE;//for  number
                for(int i=0;i<A.length;i++)
                {
                    if(A[i]%2==0)
                    {
                        if(A[i]>max)
                        {
                            max = A[i];
                        }
                    }
                    else
                    {
                        if(A[i]<min)
                        {
                            min = A[i];
                        }
                    }
                }
                return max-min;
            }
        }



