import java.util.*;

public class P007_10001stPrime
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = input.nextInt();
        System.out.println("\nThe nth prime number is: " + nThPrimeNumber(number));

        input.close();
    }

    public static int nThPrimeNumber(int number)
    {
        int count = 0;
        int nthPrime = 0;
        int i = 0;
        
        while(count != number)
        {
            if(checkPrime(i))
            {
                count++;
                nthPrime = i;
            }
            i++;
        }
        return nthPrime;
    }

    public static boolean checkPrime(int num)
    {
        if(num == 0 || num == 1)
        {
            return false;
        }

        for(int i = 2; i <= num/2; i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}