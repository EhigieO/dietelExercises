package chapterThreeExercises;
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
    public void utmePastQuestions() {
        Scanner scan = new Scanner(System.in);
        int copiesToBuy;
        int priceOfCopies;
        System.out.print("Enter number of copies to buy: ");
        copiesToBuy = scan.nextInt();
        if ( copiesToBuy > 199){
            priceOfCopies = copiesToBuy * 800;
        }
        if (copiesToBuy > 99 && copiesToBuy < 200){
            priceOfCopies = copiesToBuy * 900;
        }
        else
            if (copiesToBuy > 49 && copiesToBuy < 100) {
                priceOfCopies = copiesToBuy * 1000;
            }
            else
                if (copiesToBuy > 29 && copiesToBuy < 50){
                    priceOfCopies = copiesToBuy * 1100;
                }
                else
                    if (copiesToBuy > 9 && copiesToBuy < 30 ){
                        priceOfCopies = copiesToBuy * 1200;
                    }
                    else
                        if (copiesToBuy > 4 && copiesToBuy < 10){
                            priceOfCopies = copiesToBuy * 1400;
                        }
                        else
                        {priceOfCopies = copiesToBuy * 1500;}

    }
}