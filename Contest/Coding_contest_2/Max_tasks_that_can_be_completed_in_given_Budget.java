package String.Contest.Coding_contest_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Max_tasks_that_can_be_completed_in_given_Budget {
    static int solve(int n,int t,int[][] task){

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Arrays.sort(task, Comparator.comparingInt( o->o[0]));
        int pqsum = 0;
        int max =0;

        for(int i=0;i<n;i++){
            int totaltime = t;
            int distance = 2*task[i][0];
            int rt = totaltime - distance;
            int currenteffort = task[i][1];

            if(rt<0){
                break;
            }
            while(pqsum >rt){
                pqsum = pqsum-pq.poll();
            }

            if(pq.isEmpty() && rt>currenteffort){
                pq.add(currenteffort);
                pqsum = pqsum+currenteffort;

            }
            else if(pqsum+currenteffort <= rt){
                pq.add(currenteffort);
                pqsum = pqsum+currenteffort;

            }
            else{
                int curr_max = pq.peek();
                if(curr_max != 0 && curr_max > currenteffort){
                    pq.poll();
                    pq.add(currenteffort);
                    pqsum = pqsum - curr_max +currenteffort;
                }
            }
            max = Math.max(max,pq.size());
        }

return max;
    }

    public static void main(String[] args) {
     int n = 2; // size of the task array
        int t = 10; //total available time
        int[][] task = {{1,3},{2,2}};
        System.out.println(solve(n,t,task));



    }
}
