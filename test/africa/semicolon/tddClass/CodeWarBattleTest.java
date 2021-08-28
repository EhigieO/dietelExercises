package africa.semicolon.tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CodeWarBattleTest {
    CodeWarBattle arraySum;
    @BeforeEach
    void startEachWith(){
        //arraySum = new Africa.semicolon.tddClass.CodeWarBattle();
    }
    @Test
    void testThatArraySumCanAddIndexInArray() {
        assertArrayEquals(new int[]{7,9}, CodeWarBattle.addIndicesInArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 18));
        assertEquals(Arrays.toString(new int[]{3,5}), Arrays.toString(CodeWarBattle.addIndicesInArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10)));
        assertEquals(Arrays.toString(new int[]{5,7}), Arrays.toString(CodeWarBattle.addIndicesInArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 14)));
        assertEquals(Arrays.toString(new int[]{0,2}), Arrays.toString(CodeWarBattle.addIndicesInArray(new int[]{3, 2, 3, 5, 5, 6, 7, 8, 9, 10}, 6)));
    }
}