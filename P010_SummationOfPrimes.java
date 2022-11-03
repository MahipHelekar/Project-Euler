import java.util.*;

public class P010_SummationOfPrimes 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the limit:");
        int limit = input.nextInt();
        System.out.println("\nSum of all the primes below " + limit + ": " + calculateSumOfPrimes(limit));

        input.close();
    }

    public static long calculateSumOfPrimes(long limit)
    {
        List<Integer> listOfPrimes = new ArrayList<>();
        listOfPrimes.add(2);

        long sumOfPrimes = 2;
        for(int i = 3; i < limit; i+=2)
        {
            if(checkPrime(i, listOfPrimes))
            {
                listOfPrimes.add(i);
                sumOfPrimes += i;
            }
        }
        return sumOfPrimes;
    }

    public static boolean checkPrime(long value, List<Integer> listOfPrimes)
    {
        for(int i : listOfPrimes)
        {
            if(value % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
