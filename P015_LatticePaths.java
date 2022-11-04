import java.math.BigInteger;
import java.util.*;

public class P015_LatticePaths
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the grid size: ");
        BigInteger gridSize = new BigInteger(input.next());
        System.out.println("\nNumber of routes through the given grid size: " + numberOfLatticePaths(gridSize));

        input.close();
    }

    public static BigInteger numberOfLatticePaths(BigInteger gridSize)
    {
        BigInteger numberOfPaths = computeFactorial(gridSize.multiply(BigInteger.TWO)).divide(computeFactorial(gridSize).multiply(computeFactorial(gridSize)));
        return numberOfPaths;
    }

    public static BigInteger computeFactorial(BigInteger gridSize)
    {
        BigInteger factorial = BigInteger.ONE;
        
        while(gridSize.compareTo(BigInteger.ZERO) > 0)
        {
            factorial = factorial.multiply(gridSize);
            gridSize = gridSize.subtract(BigInteger.ONE);
        }
        return factorial;
    }
}