import java.util.*;

public class P002_EvenFibonacciNumbers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the limit:");
        int limit = input.nextInt();

        System.out.println("\nSum of even valued terms: " + findEvenTerms(limit));

        input.close();
    }

    public static int findEvenTerms(int limit) 
    {
        int term1 = 0;
        int term2 = 1;
        int term3 = 0;

        int sumOfEvenValuedTerms = 0;

        while(term3 <= limit)
        {
            term3 = term1 + term2;
            if(term3 % 2 == 0)
            {
                sumOfEvenValuedTerms += term3;
            }
            term1 = term2;
            term2 = term3;
        }
        return sumOfEvenValuedTerms;
    }
}
