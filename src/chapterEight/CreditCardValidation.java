package chapterEight;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Scanner;

public class CreditCardValidation {

    public int sumOfDoubleEvenPlace(String number) {
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


    public String isValid(String number) {
        int[] cardNumber = new int[number.length()];
        if (number.length() == 13 || number.length() == 16) {
            for (int i = 0; i < number.length(); i += 2) {
                char temp = number.charAt(i);
                cardNumber[i] = getDigit(Character.getNumericValue(temp));
            }
        } else
            throw new InvalidParameterException("Enter a valid credit card number");
        return null;
    }

    public int[] getNumberArray(String number) {
        int[] cardNumber = new int[number.length()];
        if (number.length() >= 13 && number.length() <= 16) {
            for (int i = 0; i < number.length(); i++) {
                char temp = number.charAt(i);
                cardNumber[i] = Character.getNumericValue(temp);
            }
        }
        return cardNumber;
    }

    public int getDigit(int number) {
        number *= 2;
        if (number > 9) {
            number = 1 + number % 10;
        }
        return number;
    }

    public int getSize(int[] cardNumber) {

        return cardNumber.length;
    }

    public int getPrefix(int[] cardNumber) {

        return 0;
    }


//    public void setFullName(String fullName) {
//        String [] names = fullName.split(" ");
//        firstName = names[0];
//        lastName = names[1];
//        this.fullName = lastName+ " "+ lastName;
//         this.fullName = fullName;
        //   }
    }
