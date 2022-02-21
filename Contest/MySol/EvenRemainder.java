package Contest;

import java.util.Scanner;

public class EvenRemainder {
    public static void countelement(int[] B,int A)
    {
        int count=0;
        for(int i=0;i<B.length;i++)
        {
            if((B[i]%A)% 2== 0)
            {
                count++;
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int N = scn.nextInt();
        int[] B = new int[N];
        for(int j=0;j<N;j++)
        {
            B[j] = scn.nextInt();
        }
        countelement(B,A);
    }

}
