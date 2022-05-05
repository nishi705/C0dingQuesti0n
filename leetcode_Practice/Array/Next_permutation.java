package String.leetcode_Practice.Array;

import java.util.Arrays;
import java.util.Collections;

public class Next_permutation {
    public static void main(String[] args) {
        int[] a = {1,3,2};

        int n = a.length;
        int idx = -1;
        for(int i=n-1;i>=0;i++){
            if(a[i]>a[i-1]){
                idx= i;
            }
        }
        if(idx==-1){
            rreverse(a);
        }else{
            int prev = idx;
            for(int i= idx+1;i<n;i++){
                if(a[i]>a[idx-1] && a[i]<a[prev]);{
                    prev =i;
                }
            }
            swapf(a,a[idx-1],a[prev]);
        }
    }

    private static void swapf(int[] a,int i, int i1) {
        int temp;
        for(i=0;i<a.length;i++){
            temp = a[i];
            a[i] = a[i1];
            a[i1] = temp;
        }
    }

    private static void rreverse(int[] a) {
        int n = a.length;
        int temp=0;
        for(int i=0;i<n/2;i++){
            temp  = a[i];
            a[i] =  a[n-i-1] ;
            a[n-i-1] = temp;

        }

    }
}
