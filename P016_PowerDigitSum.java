import java.math.BigInteger;
import java.util.*;

public class P016_PowerDigitSum 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the exponent: ");
        int exponent = input.nextInt();
        System.out.println("\nSum of the digits of the number 2 ^ " + exponent + ": " + powerDigitSum(exponent));

        input.close();
    }

    public static int powerDigitSum(int exponent)
    {
        BigInteger powerOutput = (BigInteger.TWO).pow(exponent);
        int sum = 0;
        int lastdigit;

        while(powerOutput.compareTo(BigInteger.ZERO) > 0)
        {
            lastdigit = powerOutput.mod(BigInteger.TEN).intValue();
            sum += lastdigit;
            powerOutput = powerOutput.divide(BigInteger.TEN);
        }
        return sum;
    }
}
