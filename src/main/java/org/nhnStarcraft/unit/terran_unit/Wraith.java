package org.nhnStarcraft.unit.terran_unit;

import org.nhnStarcraft.unit.tribe.Terran;
import org.nhnStarcraft.unit.unit_characteristic.AirUnit;
import org.nhnStarcraft.unit.unit_characteristic.AllRounder;

public class Wraith extends AirUnit implements Terran, AllRounder {
    public Wraith() {
        super(3, 10);
    }
}
