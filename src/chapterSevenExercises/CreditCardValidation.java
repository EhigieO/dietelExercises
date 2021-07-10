package chapterSevenExercises;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Scanner;

public class CreditCardValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter credit card details:");
        String number = scanner.next();
        if (isValid(number)){
            System.out.println("Credit Card is valid");
        }
    }

    private static int sumOfCardNumbers(String number) {
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

    private static int getDigit(int number) {
        number *= 2;
        if (number > 9) {
            number = 1 + number % 10;
        }
        return number;
    }

    private static int getSize(int[] cardNumber) {
        return cardNumber.length;
    }

    private static boolean getPrefixMatched(int[] number, int d) {
        return getPrefix(number, getNumericSize(d)) == d;
    }
    private static int getPrefix(int []number,int k){
        if (getSize(number) > k){
            StringBuilder num = new StringBuilder();
            for ( int i = 0; i <= k;i++) num.append(number[i]);
            return Integer.parseInt(num.toString());
        }
        return Integer.parseInt(Arrays.toString(number));
    }

    private static int getNumericSize(int d) {
        String num = d + "";
        return num.length() - 1;
    }


//    public void setFullName(String fullName) {
//        String [] names = fullName.split(" ");
//        firstName = names[0];
//        lastName = names[1];
//        this.fullName = lastName+ " "+ lastName;
//         this.fullName = fullName;
        //   }
    }
