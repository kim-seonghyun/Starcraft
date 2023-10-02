package org.nhn.unit.terran_unit;

import org.nhn.tribe.Terran;
import org.nhn.unit.unit_characteristic.AirUnit;
import org.nhn.unit.unit_characteristic.AllRounder;

public class Wraith extends AirUnit implements Terran, AllRounder {
    public Wraith() {
        super(3, 10);
    }
}
