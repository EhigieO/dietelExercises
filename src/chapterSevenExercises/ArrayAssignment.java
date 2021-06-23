package chapterSevenExercises;

import java.util.Arrays;

    public class ArrayAssignment {
        public static void main(String[] args) {
            int[][] multiArray = {{23, 12, 57,}, {51, 10, 92}, {10, 12, 22}};
            for (int a = 0;a < 3;a++ ){
                for (int b = 0; b < 3; b++){
                        System.out.print(multiArray[a][b] + " ");
                }
                System.out.println();
            }


//        int[][][] arr = {{{1, 2}, {3, 4}},{{5,6},{4,8}}};
//
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//
//            System.out.println();
//        }
        }
    }