package org.nhn.unit.zerg_unit;

import org.nhn.tribe.Zerg;
import org.nhn.unit.unit_characteristic.FlyableUnit;

public class Guardian extends FlyableUnit implements Zerg {
    public Guardian() {
        super(3, 6);
    }
}
