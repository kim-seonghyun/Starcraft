package org.nhn.unit.terran_unit;

import org.nhn.tribe.Terran;
import org.nhn.unit.unit_characteristic.GroundUnit;

public class Tank extends GroundUnit implements Terran {
    public Tank() {
        super(7, 15);
    }
}
