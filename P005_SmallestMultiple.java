import java.util.*;

public class P005_SmallestMultiple 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        System.out.println("\nSmallest positive number that is evenly divisble by all of the numbers from 1 to " + number + ": " + smallestMultiple(number));

        input.close();
    }

    public static int smallestMultiple(int number)
    {
        int found = 0;
        int multiple = number;

        if(number == 2)
        {
            return 2;
        }

        while(found == 0)
        {
            int count = 0;
            for(int i = 2; i <= number; i++)
            {
                if(multiple % i == 0)
                {
                    count++;
                }
            }

            if(count == number-1)
            {
                return multiple;
            }
            multiple++;
        }
        return multiple;
    }
}
