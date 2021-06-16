package chapterSixExercises;

public class BaseNumbers {
    public static void main(String[] args) {
        decimalToOctal(1792);
        //decimalToHexadecimal(1228);
    }
    public static String decimalToOctal(int decimalNumber){
        int digit;
        String octalNumber = "";

            for (int i = 0; i < decimalNumber; i++){
                digit = decimalNumber % 8;
                decimalNumber /= 8;
                octalNumber = digit + octalNumber;
            }

        System.out.println(decimalNumber + octalNumber);
        return decimalNumber + octalNumber;

    }
    public static String decimalToHexadecimal(int decimalNumber){
        int digit;
        String hexaDecimal = "";

        for (int i = 0; i < decimalNumber; i++){
            digit = decimalNumber % 16;
            decimalNumber /= 16;
            if (digit == 10) digit = hexaDecimal = A + hexaDecimal;;
            if (digit == 11) digit = B;
            if (digit == 12) digit = C;
            if (digit == 13) digit = D;
            if (digit == 14) digit = E;
            if (digit == 15) digit = F;

            hexaDecimal = digit + hexaDecimal;
        }

        System.out.println(decimalNumber + hexaDecimal);
        return decimalNumber + hexaDecimal;
    }
}
