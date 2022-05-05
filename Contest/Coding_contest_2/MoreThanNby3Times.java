package String.Contest.Coding_contest_2;

import java.util.Arrays;
import java.util.List;

public class MoreThanNby3Times {

    public static void main(String[] args) {
        //int[] A={1,5,3,1,2,1};


        List<Integer> A = Arrays.asList(1,5,3,1,2,1);
        int N = A.size();
        int count =0;

        for(int i=0;i<N;i++){
            int a = Math.abs(A.get(i));
            if(A.get(a-1) > 0){
                A.add(-A.get(a-1));
            }
            else{
                count++;
                if(count >= N/3){
                    System.out.println(a);
                }
            }
        }

//        int N = A.length;
//        int count =0;
//        for(int i=0;i<A.length;i++){
//
//            int abs_value = Math.abs(A[i]);
//            if(A[abs_value -1] > 0){
//                A[abs_value - 1] = -A[abs_value -1];
//            }
//            else{
//                count++;
//                if(count >= N/3){
//                    System.out.println(abs_value);
//                }
//
//            }
//
//        }

    }
}
