package org.nhn.unit.protos_unit;

import org.nhn.tribe.Protos;
import org.nhn.unit.Unit;
import org.nhn.unit.unit_characteristic.GroundUnit;

public class Dragoon extends GroundUnit implements Protos {
    public Dragoon() {
        super(3, 15);
    }

    @Override
    public boolean attack(Unit unit) {
        return unit.attacked(super.getAtk());
    }
}
