package String.Contest.Coding_contest_2;

public class Beautiful_Number {
    public static void main(String[] args) {


        System.out.println("List of happy numbers between 1 and 100: ");
        int sum =0;
        for(int i = 13; i <= 16827; i++) {
            int result = i;

            //Happy number always ends with 1 and
            //unhappy number ends in a cycle of repeating numbers which contains 4
            while (result != 1 && result != 4) {
                result = isHappyNumber(result);
                //System.out.println(result);
            }

           if (result == 1) {
               sum = sum +i;
               System.out.print(i + " ");
           }


        }
        //System.out.println(sum);

    }

    private static int isHappyNumber(int num) {

        int rem = 0, sum = 0;

        //Calculates the sum of squares of digits
        while(num > 0){
            rem = num%10;
            sum = sum + (rem*rem);
            num = num/10;
        }
        return sum;
    }
}
