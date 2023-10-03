import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.nhnStarcraft.GameOperator.GameOperator;
import org.nhnStarcraft.GameOperator.UnitOnField;
import org.nhnStarcraft.unit.Unit;

public class testGameOperator {
    @Test
    @DisplayName("generator 테스트")
    void testProvideUnitOnField(){
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);

        GameOperator gameOperator = new GameOperator();
        UnitOnField unit = gameOperator.provideUnitOnField();
        Assertions.assertEquals(5, unit.getListSize());
    }
}
