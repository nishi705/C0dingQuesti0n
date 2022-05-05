package String.leetcode_Practice.Array;

public class Buy_and_sell_the_stock {
    public static void main(String[] args) {
        int[] A={3,5,1,7,4,9,3};

        int max = Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;i++){

                int val = A[j]- A[i];
                max = Math.max(max,val);
            }
        }
    }
}
