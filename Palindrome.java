
/**
 * Write a description of class Palindrome here.
 *
 * @author (Nhlakanipho Ngwenya)
 * @version (15 March 2021)
 */
import java.util.Scanner;
import java.lang.String;
public class Palindrome
{
    public static int reverse(int number)
    {
        int result = 0;
        while (number != 0) 
        {
            int remainder = number % 10;

            result = result * 10 + remainder;

            number = number / 10;
        }
        return result;
    }
      
    public static String reverse(String str)
    {
        String stringResult = "";
        for (int i = 0; i < str.length(); i++) 
        {
           stringResult = str.charAt(i) + stringResult;
        }
        return stringResult;
    }
        
    public static boolean palindromeInteger(int number)
    {
        boolean result = true;
        if (number != reverse(number))
        {
            result = false;
            System.out.println("The number " + number + " is not palindrome");
        }
        else
        {
            System.out.println("The number " + number + " is palindrome");
        }
        
        return result;
        
    }
        
    public static boolean palindromeString(String str)
    {
        boolean result = true;
        if (!(str.equals(reverse(str))))
        {
             result = false;
             System.out.println("The word " + str + " is not palindrome");
        }
        else 
        {
             System.out.println("The word " + str + " is palindrome");
        }
        return result;
    }
        
    
    public static void main(String [] args)
    {
        System.out.print("\f");
        Scanner input = new Scanner(System.in);
        
           
        System.out.println("Enter a number(x) or a word(y): ");
        String option = input.nextLine();
    
        if (option == "x")
        {
            System.out.println("Enter a number to test for palindrome: ");
            int number = input.nextInt();
            boolean result  = palindromeInteger(number);
        }
        else if ( option == "y")
        {
            System.out.println("Enter a word to test for palindrome: ");
            String str = input.nextLine();
            boolean result = palindromeString(str);
        }
        
    }       
}
