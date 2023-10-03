package org.nhnStarcraft.unit.terran_unit;

import org.nhnStarcraft.unit.tribe.Terran;
import org.nhnStarcraft.unit.unit_characteristic.AllRounder;
import org.nhnStarcraft.unit.unit_characteristic.GroundUnit;

public class Goliath extends GroundUnit implements Terran, AllRounder {
    public Goliath() {
        super(5, 15);
    }
}
