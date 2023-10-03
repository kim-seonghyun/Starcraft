package org.nhnStarcraft.GameOperator;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import org.nhnStarcraft.unit.Unit;
import org.nhnStarcraft.unit.protos_unit.Corsair;
import org.nhnStarcraft.unit.protos_unit.Dragoon;
import org.nhnStarcraft.unit.protos_unit.HighTempler;
import org.nhnStarcraft.unit.protos_unit.Scout;
import org.nhnStarcraft.unit.protos_unit.Zealot;
import org.nhnStarcraft.unit.terran_unit.Goliath;
import org.nhnStarcraft.unit.terran_unit.Marine;
import org.nhnStarcraft.unit.terran_unit.Tank;
import org.nhnStarcraft.unit.terran_unit.Valkyrie;
import org.nhnStarcraft.unit.terran_unit.Wraith;
import org.nhnStarcraft.unit.zerg_unit.Guardian;
import org.nhnStarcraft.unit.zerg_unit.Hydralisk;
import org.nhnStarcraft.unit.zerg_unit.Mutalisk;
import org.nhnStarcraft.unit.zerg_unit.Ultralisk;
import org.nhnStarcraft.unit.zerg_unit.Zergling;

public class GameOperator {
    public final int unitTypes = 5;
    // UnitOnField 먼저 add 하고 player에게 줌.
    ArrayList<UnitOnField> units = new ArrayList<>();

    public ArrayList<UnitOnField> getUnits() {
        return units;
    }

    public UnitOnField provideUnitOnField() throws IllegalArgumentException{
        UnitOnField unitOnField = null;
        System.out.println("종족을 입력하세요 ->  Zerg : 0, Terran : 1, Protos: 2");
        Scanner sc = new Scanner(System.in);
        int tribe = sc.nextInt();

        if (tribe < 0 || tribe > 2) {
            throw new IllegalArgumentException("0에서 2사이의 숫자를 입력하세요");
        }

        switch (tribe) {
            case 0: unitOnField = new UnitOnField(createZergUnit());break;
            case 1: unitOnField = new UnitOnField(createTerranUnit()); break;
            case 2: unitOnField = new UnitOnField(createProtosUnit()); break;
        }
        this.units.add(unitOnField);
        return unitOnField;
    }

    public UnitOnField provideUnitOnFieldForComputer(int tribe) throws IllegalArgumentException{
        UnitOnField unitOnField = null;
        if (tribe < 0 || tribe > 2) {
            throw new IllegalArgumentException("0에서 2사이의 숫자를 입력하세요");
        }

        switch (tribe) {
            case 0: unitOnField = new UnitOnField(createZergUnit());break;
            case 1: unitOnField = new UnitOnField(createTerranUnit()); break;
            case 2: unitOnField = new UnitOnField(createProtosUnit()); break;
        }
        this.units.add(unitOnField);
        return unitOnField;
    }


    private Unit[] createZergUnit() {
        Unit[] zergUnits = new Unit[8];
        for (int i = 0; i < zergUnits.length; i++) {
            zergUnits[i] = getZergUnit((int) (Math.random() * unitTypes));

        }
        return zergUnits;
    }

    private Unit[] createProtosUnit() {
        Unit[] protosUnits = new Unit[4];
        for (int i = 0; i < protosUnits.length; i++) {
            protosUnits[i] = getProtosUnit((int) (Math.random() * unitTypes));
        }
        return protosUnits;
    }

    private Unit[] createTerranUnit() {
        Unit[] terranUnits = new Unit[5];
        for (int i = 0; i < terranUnits.length; i++) {
            terranUnits[i] = getTerranUnit((int) (Math.random() * unitTypes));
        }
        return terranUnits;
    }

    private Unit getZergUnit(int n) {
        switch (n) {
            case 0:
                return new Hydralisk();
            case 1:
                return new Zergling();
            case 2:
                return new Guardian();
            case 3:
                return new Ultralisk();
            case 4:
                return new Mutalisk();
            default:
                return null;
        }
    }

    private Unit getProtosUnit(int n) {
        switch (n) {
            case 0:
                return new Corsair();
            case 1:
                return new Dragoon();
            case 2:
                return new HighTempler();
            case 3:
                return new Scout();
            case 4:
                return new Zealot();
            default:
                return null;
        }

    }

    private Unit getTerranUnit(int n) {
        switch (n) {
            case 0:
                return new Goliath();
            case 1:
                return new Marine();
            case 2:
                return new Tank();
            case 3:
                return new Valkyrie();
            case 4:
                return new Wraith();
            default:
                return null;
        }
    }
}
