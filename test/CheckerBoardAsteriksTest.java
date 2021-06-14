import chapterFourExercises.CheckerBoardAsteriks;
import org.junit.jupiter.api.Test;

public class CheckerBoardAsteriksTest {
    private CheckerBoardAsteriks checkerBoardAsteriks;
    @Test
    void testToPrintPattern() {
        CheckerBoardAsteriks pattern = new CheckerBoardAsteriks();
        pattern.printAsteriks();
    }
}
