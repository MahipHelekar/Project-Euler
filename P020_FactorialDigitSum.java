import java.math.BigInteger;
import java.util.*;

public class P020_FactorialDigitSum 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        BigInteger number  = new BigInteger(input.next());
        System.out.println("\nThe sum of the digits of " + number + "!: " + factorialDigitSum(number));

        input.close();
    }

    public static BigInteger factorialDigitSum(BigInteger number)
    {
        BigInteger factorial = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        BigInteger digit = BigInteger.ZERO;

        while(number.compareTo(BigInteger.ZERO) > 0)
        {
            factorial = factorial.multiply(number);
            number = number.subtract(BigInteger.ONE);
        }

        while(factorial.compareTo(BigInteger.ZERO) > 0)
        {
            digit = factorial.mod(BigInteger.TEN);
            sum = sum.add(digit);
            factorial = factorial.divide(BigInteger.TEN);
        }
        return sum;
    }
}
