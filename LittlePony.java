package BinarySearch;

public class LittlePony {
    public class Solution {
        public int[] solve(int[] A, int[] B) {

            for(int i=1;i<A.length;++i)
            {
                A[i] = A[i]+A[i-1];
            }
            int[] res = new int[B.length];
            for(int i=0;i<B.length;i++)
            {
                res[i] = binarySearch(A,B[i]);
            }

            return res;
        }
        public int binarySearch(int[] A, int N)
        {
            int s=1;
            int e= A.length-1;
            int mid=(s+e)/2;
            int res=0;
            while(s<=e)
            {
                mid = (s+e)/2;
                if(A[mid]==N)
                {
                    res=mid;
                    break;
                }
                if(A[mid]>N){
                    e=mid-1;

                }
                else if(A[mid]<N)
                {
                    s= mid+1;
                    res =mid;
                }

            }
            return res==0?0: res+1;

        }
    }


}
