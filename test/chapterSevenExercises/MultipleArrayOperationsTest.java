package chapterSevenExercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleArrayOperationsTest {
    private MultipleArrayOperations arrayOperations;

    @Test
    void operationsCanAddArrays(){
        arrayOperations = new MultipleArrayOperations();
       // int[] values = new int[]{25,32,84,20,35,24,99,10,74,45};
       // int [] values = {25, 32, 84, 20, 35, 24, 99, 10, 74, 45};
        assertEquals(448, arrayOperations.sumUpArrays(new int[]{25, 32, 84, 20, 35, 24, 99, 10, 74, 45}));
    }
    @Test
    void operationsCanFindMaxArrays(){
        arrayOperations = new MultipleArrayOperations();
        assertEquals(99,arrayOperations.findMaxArray(new int[]{25, 32, 84, 20, 35, 24, 99, 10, 74, 45}));

    }
    @Test
    void operationsCanFindMinArrays(){
        arrayOperations = new MultipleArrayOperations();
        assertEquals(10,arrayOperations.findMinArray(new int [] {25, 32, 84, 20, 35, 24, 99, 10, 74, 45}));
    }
    @Test
    void OperationsCanFindAverageOfArrays(){
        arrayOperations = new MultipleArrayOperations();
        assertEquals(44.8,arrayOperations.findAverageArray(new int [] {25, 32, 84, 20, 35, 24, 99, 10, 74, 45}));
    }
    @Test
    void testOfInfiniteNumbers(){
        arrayOperations = new MultipleArrayOperations();
        assertEquals(289, arrayOperations.sumUpInfiniteNumbers("Ehigie",25,65,21,47,98,12,21));
    }
}