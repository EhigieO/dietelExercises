package chapterSevenExercises;

public class MultipleArrayOperations {
    int maxArray = 0;


    public int sumUpArrays(int[] values) {
        int sum = 0;
        for (int i = 1; i < values.length; i++) {
            sum = sum + values[i];
        }
        return sum;
    }

    public int findMaxArray(int[] values) {
        for (int i = 1; i < values.length; i++) {
            maxArray = Math.max(values[i], maxArray);
        }
        return maxArray;
    }


    public int findMinArray(int[] values) {
        int minArray = Integer.MAX_VALUE;
        for (int i = 1; i < values.length; i++) {
            minArray = Math.min(values[i], minArray);
        }
        return minArray;
    }

    public int findAverageArray(int[] values) {
        int averageArray;
        averageArray = sumUpArrays(values)/ values.length;
        return averageArray;
    }
}

