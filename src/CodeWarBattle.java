public class CodeWarBattle {

    public static void addIndicesInArray(int[] arraySum, int number) {
        int j;
        int temp = 0;
        for (int i = 0; i < arraySum.length; i++) {
            for (j = 1; j < arraySum.length; j++) {
                temp = arraySum[i] + arraySum[j];
            }
            if (temp == number) System.out.printf("%d %d", i, (j-1));
        }
    }

    public static void main(String[] args) {
        int [] arraySum = {10,2,3,4,5,6,7,8,9,5};
        int number = 15;
        addIndicesInArray(arraySum,number);
    }
}