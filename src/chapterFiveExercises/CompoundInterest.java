package chapterFiveExercises;

public class CompoundInterest {
    public static void main(String[] args) {
        double tuition = 10000;
        double rate = 0.05;
        double sum = 0;
        double amount = 0;
        for (int n = 1;n <= 14; n++){
            tuition = tuition + tuition * rate;
            if (n == 10){
                amount = tuition;
            }
            if (n > 10){
                sum = sum + tuition;
            }
        }
        System.out.printf("The Amount at 10 years is $%.3f%n",amount);
        System.out.printf("The sum for  four years After ten years is $%.3f%n",sum);
    }
}
