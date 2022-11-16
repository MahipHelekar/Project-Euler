import java.util.*;
import java.text.SimpleDateFormat;

public class P019_CountingSundays 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the starting year: ");
        int startingYear = input.nextInt();
        System.out.println("\nEnter the ending year: ");
        int endingYear = input.nextInt();

        System.out.println("\nNumber of sundays that fell on the first of the month during the twentieth century between the given years: " + iterateBetweenDates(startingYear, endingYear));

        input.close();
    }

    public static int iterateBetweenDates(int year1, int year2) 
    {
        String[] months = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        int sundayCount = 0;

        SimpleDateFormat DateFor = new SimpleDateFormat("dd/MM/yyyy");

        for(int i = year1; i <= year2; i++)
        {
            for(int j = 0; j < months.length; j++)
            {
                try
                {
                    Date date = DateFor.parse("01/" + months[j] + "/" + i);
                    if(date.getDay() == 0)
                    {
                        sundayCount++;
                    }
                }

                catch(Exception e)
                {

                }
            }
        }
        return sundayCount;
    }
}
