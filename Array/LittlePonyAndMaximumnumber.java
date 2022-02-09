package Array;

public class LittlePonyAndMaximumnumber {
     static int searchElement(int[]arr,int x) {
         int n = arr.length;
         if (arr[n - 1] == x)
             return 1;

         int backup = arr[n - 1];
         arr[n - 1] = x;

         for (int i = 0; ; i++) {
             if (arr[i] == x) {
                 arr[n - 1] = backup;
                 if (i < n - 1)
                     return 1;
                 return -1;

             }
         }
     }
            public static void main (String[]args)
            {
                int[] A = {24, 33, 13, 11, 30, 28, 19, 8, 30, 25, 42, 6, 30, 49, 3, 49, 24, 13, 3, 50};
                int B = 13;
                int C = searchElement(A, B);

                if (C == 1) {
                    int count = 0;
                    for (int i = 0; i < A.length; i++) {
                        if (A[i] > B) {
                            count++;
                        }
                    }
                    System.out.println(count);

                }
                System.out.println(-1);
            }

    }
