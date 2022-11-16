import java.util.*;

public class P022_NamesScores
{
    public static void main(String[] args)
    {
        String test1[] = {"THIS", "IS", "ONLY", "A", "TEST"};
        //String test2[] = {"I", "REPEAT", "THIS", "IS", "ONLY", "A", "TEST"};

        Arrays.sort(test1);
        System.out.println("\nTotal of all the name scores in the array: " + namesScores(test1));
    }

    public static int namesScores(String test[])
    {
        int finalSum = 0;

        for(int i = 0; i < test.length; i++)
        {
            int sumOfWord = 0;
            int finalScore = 0;

            for(int j = 0; j < test[i].length(); j++)
            {
                sumOfWord += getLetterCount(test[i].charAt(j));
            }
            finalScore = sumOfWord * (i + 1);
            finalSum += finalScore;
        }
        return finalSum;
    }

    public static int getLetterCount(char testLetter)
    {
        char alphabets[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        
        for(int i = 0; i < alphabets.length; i++)
        {
            if(testLetter == alphabets[i])
            {
                return (i + 1);
            }
        }
        return 0;
    }
}