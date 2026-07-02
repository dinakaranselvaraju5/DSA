/*

    Leetcode Question Number : 1491
    Average Salary Excluding the Minimum and Maximum Salary

    You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.

 

Example 1:

Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
Example 2:

Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
 

Constraints:

3 <= salary.length <= 100
1000 <= salary[i] <= 106
All the integers of salary are unique.

*/



package Leetcode_Series;

public class AverageSalary {

    public static void main(String[] args) {
        int[] arr = {4000,3000,1000,2000,6700,7800,100000,1800};
        double answer = average(arr);
        System.out.println(answer);

    }

    // Suggested: Array/Brute-Force Search
    public static double average(int[] salary) {
        int ans1 = max(salary);
        int ans2 = min(salary);
        double count = 0.0;
        double sum = 0.0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]!=ans1 && salary[i]!=ans2){
                sum = sum + salary[i];
                count++;
            }
        }
        return sum/count;
    }

    public static int max(int[] arr){
        int Max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > Max){
                Max = arr[i];
            }
        }
        return Max;
    }

    public static int min(int[] arr){
        int Min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < Min){
                Min = arr[i];
            }
        }
        return Min;
    }
}


/* 
    Current: Sorting/Array
    Current complexity: O(N log N)
    Suggested complexity: O(N)
    Suggestions: Replace sorting with a single pass to find min, max, and sum directly.

public static double average(int[] salary) {
        Arrays.sort(salary);
        int n = salary.length;
        double count = 0.0f;
        double result = 0;
        for(int i=1;i<n-1;i++){
            result = result + salary[i];
            count++;
        }

        return result/count;
    }

    */