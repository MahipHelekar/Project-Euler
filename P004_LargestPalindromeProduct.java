import java.util.*;

public class P004_LargestPalindromeProduct
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of digits: ");
        int numberOfDigits = input.nextInt();
        System.out.println("\nLargest palindrome product: " + largestPalindromeProduct(numberOfDigits));

        input.close();
    }

    public static int largestPalindromeProduct(int numberOfDigits)
    {
        int product;
        int maxProduct = 0;

        for(int i = (int) Math.pow(10, numberOfDigits) - 1; i > (int) Math.pow(10, numberOfDigits) - (int) Math.pow(10, numberOfDigits - 1); i--)
        {
            for(int j = (int) Math.pow(10, numberOfDigits) - 1; j > (int) Math.pow(10, numberOfDigits) - (int) Math.pow(10, numberOfDigits - 1); j--)
            {
                product = i * j;
                if(checkPalindrome(product))
                {
                    if(product > maxProduct)
                    {
                        maxProduct = product;
                    }
                }
            }
        }
        return maxProduct;
    }

    public static boolean checkPalindrome(int product) 
    {
        int temp = product;
        int reversedNumber = 0;
        int lastDigit;

        while(product > 0)
        {
            lastDigit = product % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            product /= 10;
        }

        if(temp == reversedNumber)
        {
            return true;
        }
        return false;
    }
}