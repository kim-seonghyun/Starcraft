package org.nhn.unit.terran_unit;

import org.nhn.tribe.Terran;
import org.nhn.unit.Unit;
import org.nhn.unit.unit_characteristic.GroundUnit;

public class Marine extends GroundUnit implements Terran {
    public Marine() {
        super(3, 10);
    }
}
