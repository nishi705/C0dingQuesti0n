package String.Contest.Coding_contest_2;

public class Find_the_missingAnd_Repeatitive_Element {
    public int[] repeatelement(final int[] A) {
        int[] N = new int[2];
        int k = 0;

        for (int i = 0; i < A.length; i++){
            int abs_val = Math.abs(A[i]);
            if(A[abs_val -1] > 0){
                A[abs_val -1] = -A[abs_val -1];
            }else{
                N[0] = abs_val;
            }
        }
    for(int i=0;i<A.length;i++){
        if(A[i]>0){
            N[1] = i+1;
        }
    }
return N;
    }

}
