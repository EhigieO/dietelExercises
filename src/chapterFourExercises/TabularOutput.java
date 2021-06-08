package chapterFourExercises;

public class TabularOutput {
    public static void main(String[] args) {
        int multiplier1;
        int multiplier2;
        int multiplier3;
        System.out.println("N     N*10   N*100   N*1000");
        for (int n = 1; n <= 5; n++){
            multiplier1 = (n*10);
            multiplier2 = (n*100);
            multiplier3 = (n*1000);
            System.out.printf("%d     %d     %d     %d%n",n,multiplier1,multiplier2,multiplier3);
        }
    }
}
