package chapterFourteen;

import java.util.Arrays;
import java.util.Scanner;

public class TokenPhone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String phoneNumber =  "(555) 555-5555"; //scanner.nextLine();
       // phoneNumber.split(3);
        String[] tokens = phoneNumber.replaceAll("[()]","").split("[-]");
        String joined = phoneNumber.replaceAll("\\D","");
        System.out.println(Arrays.toString(tokens));
        System.out.println(joined);

    }
}
