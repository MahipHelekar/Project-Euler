import java.util.*;

public class P021_AmicableNumbers 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the limit: ");
        int limit = input.nextInt();
        System.out.println("\nThe sum of all the amicable numbers under " + limit + ": " + sumOfAmicableNumbers(limit));

        input.close();
    }

    public static int sumOfAmicableNumbers(int number)
    {
        int sum = 0;

        for(int i = 1; i < number; i++)
        {
            if(checkIfAmicableNumbers(i))
            {
                sum += i;
            }
        }
        return sum;
    }
    
    public static boolean checkIfAmicableNumbers(int num)
    {

        int output = sumOfDivisors(num);

        if(num == 1) 
        {
            return false;
        }

        if(num == sumOfDivisors(output) && num!=output)
        {
            return true;
        }
        return false;
    }

    public static int sumOfDivisors(int num)
    {
        int divisorSum = 1;

        for(int i = 2; i <= num / 2; i++)
        {
            if(num % i == 0)
            {
                divisorSum += i;
            }
        }
        return divisorSum;
    }
}
