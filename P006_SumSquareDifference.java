import java.util.*;

public class P006_SumSquareDifference
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = input.nextInt();
        System.out.println("\nDifference between the sum of the squares of the first " + limit + 
        " natural numbers and the square of the sum: " + sumSquareDifference(limit));

        input.close();
    }

    public static int sumSquareDifference(int limit)
    {
        int squareSum = 0;
        int sumSquare = 0;

        for(int i = 1; i <= limit; i++)
        {
            squareSum += (int) Math.pow(i, 2);
            sumSquare += i;
        }
        sumSquare = (int) Math.pow(sumSquare, 2);

        return sumSquare - squareSum;
    }
}