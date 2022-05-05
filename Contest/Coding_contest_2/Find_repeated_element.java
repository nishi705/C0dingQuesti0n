package String.Contest.Coding_contest_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Find_repeated_element {
    public static void main(String[] args) {

        int[] A = {7, 3, 4, 5, 5, 6, 2};

        //using array.sort
//        Arrays.sort(A);
//        for(int i =1;i<A.length;i++){
//            if(A[i] == A[i-1]){
//                //System.out.println(A[i]);
//            }
//        }


        //using count
//        int[] count  = new int[A.length];
//        for(int i=0;i<A.length;i++){
//            if(count[A[i]]==1){
//                System.out.println(A[i]);
//            }
//            else{
//                count[A[i]]++;
//            }
//        }
//
//        for(int i=0;i<count.length;i++){
//            if(count[i] == 0){
//                System.out.println(i+1);
//            }
//        }



    for(int i=0;i<A.length;i++){

        int abs_value = Math.abs(A[i]);
        if(A[abs_value -1] > 0){
            A[abs_value - 1] = -A[abs_value -1];
        }
        else{
            System.out.println(abs_value);
        }

        }
    //for repeating  value

    for(int i=0;i<A.length;i++){
        if(A[i]>0){
            System.out.println(i+1);
        }
    }

    }


    }

