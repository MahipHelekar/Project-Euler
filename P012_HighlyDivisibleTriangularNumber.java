import java.util.*;

public class P012_HighlyDivisibleTriangularNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("\nValue of the first triangle number to have over " + number + " divisors: " + highlyDivisibleTriangularNumber(number));

        input.close();
    }

    public static int highlyDivisibleTriangularNumber(int number)
    {
        int term = 1;
        int i = 1;
        
        while(true)
        {
            if(checkFactor(term, number))
            {
                break;
            }
            i++;
            term += i;
        }
        return term;
    }

    public static boolean checkFactor(int term, int number) 
    {
        int count = 0;

        for(int i = 1; i <= Math.sqrt(term); i++)
        {
            if(term % i == 0)
            {
                if(term / i == i)
                {
                    count++;
                }
                else
                {
                    count += 2;
                }
            }
        }

        if(count > number)
        {
            return true;
        }
        return false;
    }
}