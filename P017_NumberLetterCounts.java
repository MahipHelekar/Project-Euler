import java.util.*;

public class P017_NumberLetterCounts
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = input.nextInt();
        System.out.println("\nIf all the numbers from 1 to given limit inclusive were written out in words, the number of letters that would be used: " + numberLetterCounts(number));

        input.close();
    }

    public static int numberLetterCounts(int number)
    {
        int properNums[] = {
                                0,
                                "one".length(), 
                                "two".length(), 
                                "three".length(), 
                                "four".length(), 
                                "five".length(), 
                                "six".length(), 
                                "seven".length(), 
                                "eight".length(), 
                                "nine".length(),
                                "ten".length(), 
                                "eleven".length(), 
                                "twelve".length(), 
                                "thirteen".length(), 
                                "fourteen".length(), 
                                "fifteen".length(), 
                                "sixteen".length(), 
                                "seventeen".length(), 
                                "eighteen".length(), 
                                "nineteen".length()
                            };

        int tens[] = {
                        0,
                        0,
                        "twenty".length(), 
                        "thirty".length(), 
                        "forty".length(), 
                        "fifty".length(), 
                        "sixty".length(), 
                        "seventy".length(), 
                        "eighty".length(), 
                        "ninety".length()
                    };
        
        int sum = 0;

        for(int i = 1; i <= number; i++)
        {
            if(i < 20)
            {
                sum += properNums[i];
            }
            else if(i < 100)
            {
                sum += tens[(int) (i / 10)] + properNums[i % 10];
            }
            else
            {
                if(i == 1000)
                {
                    sum += 11;
                }
                else
                {
                    int onesAndTens = i % 100;
                    int hundreds = (int) (i / 100); 
    
                    if(onesAndTens == 0)
                    {
                        sum += properNums[hundreds] + 7;
                    }
                    else if(onesAndTens < 20)
                    {
                        sum += properNums[hundreds] + 10 + properNums[onesAndTens];
                    }
                    else if(onesAndTens < 100)
                    {
                        sum += properNums[hundreds] + 10 + properNums[onesAndTens % 10] + tens[(int) (onesAndTens / 10)];
                    }
                }
            }
        }
        return sum;
    }
}