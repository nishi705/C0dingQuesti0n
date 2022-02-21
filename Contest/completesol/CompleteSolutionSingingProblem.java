package Contest;

import java.util.Scanner;

public class CompleteSolutionSingingProblem {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt();
        int a2 = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();

        int sum1 = a2 - b1;
        int sum2 = a2 - a1;
        int sum3 = b2 - b1;
        int ans = 0;

//     if(b2>a1)
//     {
//         if(b1<a1 && b1<a2)
//         {
//             System.out.println(sum2);
//         }
//         else if(a1<b1 && a2>b1 && a2>b2)
//         {
//             System.out.println(sum3);
//         }
//         else
//         {
//             System.out.println(sum1);
//         }
//     }
//else
//     {
//         System.out.println("0");
//     }
//
//
//    }

        if(a1<=b1)
        {
            if(a2>=b2)
            {
                ans = b2-b1;
            }
            else if(a2>=b1)
            {
                ans =a2-b1;
            }
        }
        else
        {
            if(b2>=a2)
            {
                ans = a2-a1;
            }
            else if(b2>=a1)
            {
                ans = b2-a1;
            }
        }
        System.out.println(ans);
    }
}
