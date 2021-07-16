package turtleChapSeven;

import java.util.Arrays;

public class Sketchpad {
    private int [][] floor;
    public Sketchpad(int numberOfRows, int numberOfColumns) {
        floor  = new int[numberOfRows][numberOfColumns];
    }

    public int[][] getFloor() {
        return floor;
    }
    public void displayMethod(){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++){
                if (floor[i][j] == 1){
                    System.out.print("*  ");
                }else System.out.print("_  ");
            }
            System.out.println();
        }
    }
}
