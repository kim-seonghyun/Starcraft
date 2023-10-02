import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.nhn.unit.terran_unit.Marine;
import org.nhn.unit.terran_unit.Tank;
import org.nhn.unit.terran_unit.Wraith;
import org.nhn.unit.zerg_unit.Hydralisk;

class testSrarcraft {
    @Test
    @DisplayName("attackTest")
    void testAttack() {
        Marine marine = new Marine();
        Tank tank = new Tank();

        marine.attack(tank);
        Assertions.assertEquals(12, tank.getDefense());
    }

    @Test
    @DisplayName("attackFailTest")
    void testAttackFail() {
        Marine marine = new Marine();
        Wraith wraith = new Wraith();

        Assertions.assertThrows(NullPointerException.class, ()->{
            marine.attack(wraith);
        });
    }

    @Test
    @DisplayName("testHydraliskAttacksFlyableUnit")
    void testHydralisk() {
        Hydralisk hydralisk = new Hydralisk();
        Wraith wraith = new Wraith();
        hydralisk.attack(wraith);
        Assertions.assertEquals(7, wraith.getDefense());
    }
    @Test
    @DisplayName("testHydraliskAttacksFlyableUnit_공격됐는지 확인함")
    void testHydralisk2() {
        Hydralisk hydralisk = new Hydralisk();
        Wraith wraith = new Wraith();
        hydralisk.attack(wraith);
        Assertions.assertEquals(7, wraith.getDefense());
    }
}
