package org.nhn.unit.zerg_unit;

import org.nhn.tribe.Zerg;
import org.nhn.unit.Unit;
import org.nhn.unit.unit_characteristic.GroundUnit;

public class Hydralisk extends GroundUnit implements Zerg {
    public Hydralisk() {
        super(3, 7);
    }

    @Override
    public boolean attack(Unit unit) {
        return unit.attacked(super.getAtk());
    }
}
