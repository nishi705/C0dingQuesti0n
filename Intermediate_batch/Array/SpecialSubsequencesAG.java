package Array;
/*You have given a string A having Uppercase English letters.

You have to find that how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large

 */
public class SpecialSubsequencesAG {
    public int solve(String A) {

        char[] c = A.toCharArray();

        int count = 0;
        int ans = 0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i] == 'A')
            {
                count++;
            }
            else if(c[i] == 'G')
            {
                ans+= count;
            }
        }
        return ans;

    }
}
