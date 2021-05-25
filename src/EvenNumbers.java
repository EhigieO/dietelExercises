import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
//        int number = 0;
//        while (number < 20){
//            number = number + 2;
//            System.out.printf("%d%n",number);
//        }
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter an Even number: ");
//        int num = input.nextInt();
//    int number = 1;
//    while (number <= num){
//        if (number % 2 == 0){
//            System.out.print(number+" ");
//        }
//        number = number + 1;
//    }
        System.out.print("Enter Number to find it's factors:");
        int number = input.nextInt();
        int factor = 2;
        int count  = 0;
        while (factor < number){
            if (number % factor == 0){
                count ++;
            }
            factor ++;
        }
        System.out.printf("Factors of %d are %d%n", number , count);
    }
}
