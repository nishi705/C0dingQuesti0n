package Basics;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int N =9;
        int val = N;
        int sum =0;
        while(N!=0) {

            int rem;
            rem = N % 10;
            sum = sum + (rem * rem * rem);
            N = N / 10;

        }
        System.out.println(sum);
        if(sum==val)
        {
            System.out.println("palendrome");
        }
        else
        {
            System.out.println("not palendrome");
        }


    }
}
