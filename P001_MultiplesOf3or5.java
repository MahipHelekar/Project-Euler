import java.util.*;

public class P001_MultiplesOf3or5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the limit:");
        int limit = input.nextInt();
        System.out.println("\nThe sum of all the multiples of 3 or 5 below " + limit + ": " + sumOfmultiples(limit));

        input.close();
    }

    public static int sumOfmultiples(int limit) 
    {
        int sumOfMultiples = 0;
        for(int i = 0; i < limit; i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                sumOfMultiples += i;
            }
        }
        return sumOfMultiples;
    }
}