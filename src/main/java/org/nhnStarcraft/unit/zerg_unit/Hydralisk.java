package org.nhnStarcraft.unit.zerg_unit;

import org.nhnStarcraft.unit.unit_characteristic.AllRounder;
import org.nhnStarcraft.unit.unit_characteristic.GroundUnit;
import org.nhnStarcraft.unit.tribe.Zerg;

public class Hydralisk extends GroundUnit implements Zerg, AllRounder {
    public Hydralisk() {
        super(3, 7);
    }
}
