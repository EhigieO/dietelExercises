package chapterSevenExercises;

public class MultipleArrayOperations {

    public double sumUpArrays(int[] values) {
        double sum = 0.0;
        for (int value : values) {
            sum = sum + value;
        }
        return sum;
    }

    public int findMaxArray(int[] values) {
        int maxArray = 0;
        for (int value : values) {
            maxArray = Math.max(value, maxArray);
        }
        return maxArray;
    }


    public int findMinArray(int[] values) {
        int minArray = Integer.MAX_VALUE;
        for (int value : values) {
            minArray = Math.min(value, minArray);
        }
        return minArray;
    }

    public double findAverageArray(int[] values) {
        double averageArray;
        averageArray = (sumUpArrays(values))/ values.length;
        System.out.println(averageArray);
        return averageArray;
    }
}

