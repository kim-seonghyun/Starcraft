package org.nhn.unit.unit_characteristic;

import org.nhn.unit.Unit;

public abstract class FlyableUnit extends Unit {
    protected FlyableUnit(int atk, int defense) {
        super(atk, defense);
    }

    @Override
    public boolean attack(Unit unit) {
        return unit.attacked(this.getAtk());
    }

    @Override
    public boolean attacked(int damage) {
        super.setDefense(super.defense - damage);
        return super.getDefense() >= 0;
    }

    public boolean canFly(){
        return true;
    }
}
