import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CodeWarBattleTest {
    CodeWarBattle arraySum;
    @BeforeEach
    void startEachWith(){
        arraySum = new CodeWarBattle();
    }
    @Test
    void testThatArraySumCanAddIndexInArray() {
        assertEquals(Arrays.toString(new int[]{7,9}), Arrays.toString(arraySum.addIndicesInArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 18)));
        assertEquals(Arrays.toString(new int[]{3,5}), Arrays.toString(arraySum.addIndicesInArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10)));
        assertEquals(Arrays.toString(new int[]{5,7}), Arrays.toString(arraySum.addIndicesInArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 14)));
    }
}