/*
Problem: Single Digit Sum after Repeating Digit Sum R Times

Description:
An intelligence agency has received several reports containing numbers encoded in a
special format. Each report includes two numbers:

1. N – a positive integer
2. R – the number of times an operation must be repeated

The operation works as follows:

1. Calculate the sum of all digits of the number N.
2. Repeat this digit-sum value R times (i.e., multiply the digit sum by R).
3. The resulting number may contain multiple digits. Continue summing its digits
   until a single-digit number is obtained.

If the value of R is 0, the output should be 0.

----------------------------------------------------------------

Example 1

Input:
N = 99
R = 3

Explanation:
Sum of digits of N:
9 + 9 = 18

Repeat the sum R times:
(9 + 9) + (9 + 9) + (9 + 9)
= 18 + 18 + 18
= 54

Convert to a single digit:
5 + 4 = 9

Output:
9

----------------------------------------------------------------

Example 2

Input:
N = 1234
R = 2

Explanation:
Sum of digits of N:
1 + 2 + 3 + 4 = 10

Repeat the sum R times:
(1 + 2 + 3 + 4) + (1 + 2 + 3 + 4)
= 10 + 10
= 20

Convert to a single digit:
2 + 0 = 2

Output:
2

----------------------------------------------------------------

Constraints:
0 < N <= 1000
0 <= R <= 50

----------------------------------------------------------------

Input Format:
The program should accept two inputs:

1. First input  : Integer N (positive integer)
2. Second input : Integer R (positive integer)

Output Format:
Print the resulting single-digit integer obtained after performing
the described operation. If R = 0, print 0.
*/
public class PossibleWaysToFillSistern {
    public static void main(String[] args) {
        int n = 99;
        int r = 3;
        System.out.println(solution(n, r)); // Output : 9
    }

    public static int solution(int n, int r) {
        int temp = 0;
        while (n > 0) {
            int rem = n % 10;
            temp += rem;
            n = n / 10;
        }
        int nr = r * temp;
        int res = 0;
        while (nr > 0) {
            int rem = nr % 10;
            res += rem;
            nr /= 10;
        }
        return getSingleDigitSum(res);
    }

    public static int getSingleDigitSum(int n) {
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

}
