package bike;
import java.util.Scanner;
public class Cata
{
    public static void main(String... args)
    {
        Scanner input = new Scanner(System.in);

        int number;
        int reversed = 0;
        System.out.println("Enter number: ");
        number = input.nextInt();
        int pal = number + 0;

        while(number != 0)
        {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println(reversed);
        if (reversed == pal) {
            System.out.print("Number is a Palindrome " + reversed);
        }

    }
}