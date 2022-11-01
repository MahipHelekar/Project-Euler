import java.util.*;

public class P003_LargestPrimeFactor 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        List<Integer> listOfPrimeFactors = new ArrayList<>();

        System.out.println("Enter the limit: ");
        int limit = input.nextInt();

        listOfPrimeFactors = findLargestPrimeFactor(limit, listOfPrimeFactors);

        System.out.print("The prime factors of " + limit + ": ");
        for(int i : listOfPrimeFactors)
        {
            System.out.print(i + " ");
        }

        input.close();
    } 

    public static List<Integer> findLargestPrimeFactor(int limit, List<Integer> listOfPrimeFactors)
    {
        while(limit % 2 == 0)
        {
            listOfPrimeFactors.add(2);
            limit /= 2;
        }

        for(int i = 3; i < Math.sqrt(limit); i++)
        {
            while(limit % i == 0)
            {
                listOfPrimeFactors.add(i);
                limit /= i;
            }
        }

        if(limit > 2)
        {
            listOfPrimeFactors.add(limit);
        }
        return listOfPrimeFactors;
    }
}
