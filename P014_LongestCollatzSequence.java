import java.util.*;

public class P014_LongestCollatzSequence 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the limit: ");
        long limit = input.nextInt();
        System.out.println("\nStarting number, under the given limit, that produces the longest chain: " + longestChainNumber(limit));

        input.close();
    }

    public static long longestChainNumber(long limit)
    {
        long number = 1;
        long maxChainNumber = 0;
        long maxNumber = 0;

        while(number < limit)
        {
            if(maxChainNumber < checkChain(number))
            {
                maxNumber = number;
                maxChainNumber = checkChain(number);
            }
            number++;
        }
        return maxNumber;
    }

    public static long checkChain(long number)
    {
        int count = 1;

        while(number != 1)
        {
            if(number % 2 == 0)
            {
                number /= 2;
            }
            else
            {
                number = (3 * number) + 1;
            }
            count++;
        }
        return count;
    }
}
