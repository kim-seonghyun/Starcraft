package org.nhn.unit.terran_unit;

import org.nhn.tribe.Terran;
import org.nhn.unit.unit_characteristic.FlyableUnit;

public class Valkyrie extends FlyableUnit implements Terran {
    public Valkyrie() {
        super(4, 12);
    }
}
