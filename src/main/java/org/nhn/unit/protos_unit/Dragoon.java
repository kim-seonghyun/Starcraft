package org.nhn.unit.protos_unit;

import org.nhn.tribe.Protos;
import org.nhn.unit.Unit;
import org.nhn.unit.unit_characteristic.AllRounder;
import org.nhn.unit.unit_characteristic.GroundUnit;

public class Dragoon extends GroundUnit implements Protos, AllRounder {
    public Dragoon() {
        super(3, 15);
    }
}
