import java.util.*;

public class P009_SpecialPythagorianTriplet
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the total:");
        int total = input.nextInt();
        System.out.println("\nThe product of a*b*c: " + findTriplet(total));

        input.close();
    }

    public static int findTriplet(int total)
    {
        for(int c = 1; c < total; c++)
        {
            for(int b = 1; b < c; b++)
            {
                for(int a = 1; a < b; a++)
                {
                    if(a + b + c == total)
                    {
                        boolean isEligible = checkPythgoras(a, b, c);
                        if(isEligible)
                        {
                            return (a*b*c);
                        }
                    }
                }
            }
        }
        return 0;
    }

    public static boolean checkPythgoras(int i, int j, int k) 
    {
        if(k*k == i*i + j*j)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}