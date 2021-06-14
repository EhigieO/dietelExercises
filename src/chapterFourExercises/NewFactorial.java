package chapterFourExercises;

import java.util.Scanner;
public class NewFactorial {
        // B - compute mathematical constant e
        // e = 1 + 1/1! + 1/2! + 1/3...
        private static double getConstantE(int x){
            Kata kata = new Kata();
            double e = 1.0;

            for(int i=1; i<=x; i++){
                e += 1.0/kata.findFactorial(i);
            }
            return e;
        }
        // C - compute value of e^x.
        // e^x = 1 + x/1! + x^2/2! + x^3/3!...
        private static double getValueOfE(int n, int x){
            Kata kata = new Kata();
            double e = 1.0;

            for(int i=1; i<=n; i++){
                e += x/kata.findFactorial(i);
                x = (int)Math.pow(x, i);
            }
            return e;
        }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // QB
        System.out.print("Enter the number of times to calculate e: ");
        int n = input.nextInt();

        System.out.printf("e = %.2f%n", getConstantE(n));

        // QC
        System.out.print("Enter the number of times to calculate e^x: ");
        n = input.nextInt();

        System.out.print("Enter x: ");
        int x = input.nextInt();

        System.out.printf("e^%d %d times = %.2f%n", n, n, getValueOfE(n, x));
    }
}