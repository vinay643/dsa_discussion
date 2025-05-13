package lamdaExpression;
import java.util.Arrays;

class UserMainCode {
    public int originalArray(int input1, int[] input2) {
        int n = input2.length;

        for (int len = 1; len <= n; len++) {
            if (n % len == 0) {
                boolean match = true;
                for (int i = 0; i < n; i++) {
                    if (input2[i] != input2[i % len]) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    return len;
                }
            }
        }

        return n;
    }
}

public class Freq {
    public static void main(String[] args) {
        UserMainCode solution = new UserMainCode();

        // Test Case 1: Default Test Case from the image
        int input1_1 = 10;
        int[] input2_1 = {5, 4, 7, 2, 7, 4, 4, 7, 7, 2};
        int expected1 = 4;
        int result1 = solution.originalArray(input1_1, input2_1);
        System.out.println("Test Case 1: input1 = " + input1_1 + ", input2 = " + Arrays.toString(input2_1));
        System.out.println("Expected: " + expected1 + ", Got: " + result1);
        System.out.println("Pass: " + (result1 == expected1) + "\n");

        // Test Case 2: Example 1 adjusted
        int input1_2 = 5472;
        int[] input2_2 = {5, 4, 7, 2};
        int expected2 = 4;
        int result2 = solution.originalArray(input1_2, input2_2);
        System.out.println("Test Case 2: input1 = " + input1_2 + ", input2 = " + Arrays.toString(input2_2));
        System.out.println("Expected: " + expected2 + ", Got: " + result2);
        System.out.println("Pass: " + (result2 == expected2) + "\n");

        // Test Case 3: Example 2
        int input1_3 = 11111;
        int[] input2_3 = {1, 1, 1, 1, 1};
        int expected3 = 1;
        int result3 = solution.originalArray(input1_3, input2_3);
        System.out.println("Test Case 3: input1 = " + input1_3 + ", input2 = " + Arrays.toString(input2_3));
        System.out.println("Expected: " + expected3 + ", Got: " + result3);
        System.out.println("Pass: " + (result3 == expected3) + "\n");
    }
}