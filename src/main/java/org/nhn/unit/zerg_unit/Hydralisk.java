package org.nhn.unit.zerg_unit;

import org.nhn.tribe.Zerg;
import org.nhn.unit.Unit;
import org.nhn.unit.unit_characteristic.AllRounder;
import org.nhn.unit.unit_characteristic.GroundUnit;

public class Hydralisk extends GroundUnit implements Zerg, AllRounder {
    public Hydralisk() {
        super(3, 7);
    }
}
