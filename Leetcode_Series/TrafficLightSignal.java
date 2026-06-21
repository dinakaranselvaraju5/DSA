 /* 

    Traffic Light Signal
    Leetcode Question Number : 3894

You are given an integer timer representing the remaining time (in seconds) on a traffic signal.

The signal follows these rules:

If timer == 0, the signal is "Green"
If timer == 30, the signal is "Orange"
If 30 < timer <= 90, the signal is "Red"
Return the current state of the signal. If none of the above conditions are met, return "Invalid".


*/

package Leetcode_Series;

import java.util.Scanner;

public class TrafficLightSignal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = input.nextInt();
        String ans = trafficSignal(n);
        System.out.println(ans);
        input.close();
    }

    
    public static String trafficSignal(int timer) {
        if(timer == 0)
            return "Green";
        if(timer == 30)
            return "Orange";
        if(timer >30 && timer <=90)
            return "Red";
        else
            return "Invalid";
    }
}