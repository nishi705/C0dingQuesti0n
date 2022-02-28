package Array;
/*
N light bulbs are connected by a wire.

Each bulb has a switch associated with it, however due to faulty wiring, a switch also changes the state of all the bulbs to the right of current bulb.

Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.

You can press the same switch multiple times.

Note: 0 represents the bulb is off and 1 represents the bulb is on.
 */
public class Bulbs {
    public int bulbs(int[] A) {
        int switch_press = 0;
        int curr_state = 0;
        for(int i=0;i<A.length;i++)
        {
            if((switch_press) % 2 == 0)
            {
                curr_state = A[i];
            }
            else
            {
                if(A[i]==0)
                {
                    curr_state = 1;
                }
                else
                {
                    curr_state = 0;
                }
            }

            if(curr_state == 0)
            {
                switch_press++;
            }
        }
        return switch_press;
    }
}
