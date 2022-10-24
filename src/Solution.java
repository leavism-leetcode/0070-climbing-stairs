public class Solution {
    public static int climbStairs(int n) {
        int steps = 0;
        int num1 = 0;
        int num2 = 1;

        for (int i = 1; i <= n; i++) {
            steps = num1 + num2;
            num1 = num2;
            num2 = steps;
        }

        return steps;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
}
