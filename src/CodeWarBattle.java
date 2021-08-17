public class CodeWarBattle {

    public static int[] addIndicesInArray(int[] arraySum, int number) {
        int [] result = new int[2];
        int j;
        int temp;
        for (int i = 0; i < arraySum.length; i++) {
            for (j = i+1; j < arraySum.length; j++) {
                temp = arraySum[i] + arraySum[j];
                 if (temp == number) {
                     result[0] = i;
                     result[1] = j;
                     break;
                 }
            }

        }
        return result;
    }
}