package String;

public class DivereseOfCharacter {
    public int solve(final String A) {


        int count =0;
        int count1 =0;
        for(int i=0;i<A.length();i++)
        {

            if(A.charAt(i)>=65 && A.charAt(i)<=122)
            {
                count1++;
            }
            else
            {
                count++;
            }


        }
        return Math.max(count,count1);

}
