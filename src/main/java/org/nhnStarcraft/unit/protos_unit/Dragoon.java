package org.nhnStarcraft.unit.protos_unit;

import org.nhnStarcraft.unit.tribe.Protos;
import org.nhnStarcraft.unit.unit_characteristic.AllRounder;
import org.nhnStarcraft.unit.unit_characteristic.GroundUnit;

public class Dragoon extends GroundUnit implements Protos, AllRounder {
    public Dragoon() {
        super(3, 15);
    }
}
