package creditCardValidation;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Scanner;

public class CreditCardValidation {
    CardType cardType;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter credit card details:");
        String number = scanner.next();
        if (isValid(number)) {
            System.out.println("Credit Card is valid");
        } else
            System.out.println("Enter a valid card number");


    }

    public static int sumOfCardNumbers(String number) {
        int[] cardNumber = getNumberArray(number);
        for (int i = 0; i < cardNumber.length; i += 2) {
            cardNumber[i] = getDigit(cardNumber[i]);
        }
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += cardNumber[i];
        }
        return sum;
    }


    public static boolean isValid(String number) {
        return (getNumberArray(number).length >= 13 && getNumberArray(number).length <= 16) &&
                (sumOfCardNumbers(number) % 10 == 0) &&
                ((getPrefixMatched(getNumberArray(number), 4) ||
                        getPrefixMatched(getNumberArray(number), 5) ||
                        getPrefixMatched(getNumberArray(number), 6) ||
                        getPrefixMatched(getNumberArray(number), 37)));
    }

    private static int[] getNumberArray(String number) {
        int[] cardNumber = new int[number.length()];
            for (int i = 0; i < number.length(); i++) {
                char temp = number.charAt(i);
                cardNumber[i] = Character.getNumericValue(temp);
            }
        return cardNumber;
    }

    public static int getDigit(int number) {
        number *= 2;
        if (number > 9) {
            number = 1 + number % 10;
        }
        return number;
    }

    public static int getSize(int[] cardNumber) {
        return cardNumber.length;
    }

    public static boolean getPrefixMatched(int[] number, int d) {
        return getPrefix(number, getNumericSize(d)) == d;
    }
    public static int getPrefix(int[] number, int k){
        if (getSize(number) > k){
            StringBuilder num = new StringBuilder();
            for ( int i = 0; i <= k;i++) num.append(number[i]);
            return Integer.parseInt(num.toString());
        }
        return Integer.parseInt(Arrays.toString(number));
    }

    public static int getNumericSize(int d) {
        String num = d + "";
        return num.length() - 1;
    }


    public CardType getCardType(int[] number, int d) {

        if (!getPrefixMatched(number, d)) {throw new InvalidParameterException("Invalid Card details");}
        else
            switch (d){
                case 4:
                    if(number.length == 13 || number.length == 16)
                        cardType = CardType.VISA;
                    break;
                case 6:
                    if (number.length == 16)
                        cardType = CardType.VERVE;
                    break;
                case 5:
                    if (number.length == 16)
                        cardType = CardType.MASTER;
                    break;
                case 34:
                case 37:
                    if (number.length == 15)
                        cardType = CardType.AMERICA;
                default:
            }return cardType;
    }
}