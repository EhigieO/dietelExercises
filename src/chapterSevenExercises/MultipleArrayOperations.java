package chapterSevenExercises;

public class MultipleArrayOperations {

    public static double sumUpArrays(int[] values) {
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
        averageArray = (sumUpArrays(values)) / values.length;


        return averageArray;
    }

    public int sumUpInfiniteNumbers(String name,int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        return sum;
    }
}

