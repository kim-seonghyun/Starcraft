package org.nhn.unit.unit_characteristic;

import org.nhn.unit.Unit;

public abstract class GroundUnit extends Unit {
    protected GroundUnit(int atk, int defense) {
        super(atk, defense);
    }

    @Override
    public boolean attack(Unit unit) {
        if(!unit.canFly()){
            unit.attacked(this.getAtk());
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean attacked(int damage) {
        super.setDefense(super.defense - damage);
        return super.getDefense() >= 0;
    }

    public boolean canFly(){
        return false;
    }

}
