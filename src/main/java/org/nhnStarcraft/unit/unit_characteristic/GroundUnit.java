package org.nhnStarcraft.unit.unit_characteristic;

import org.nhnStarcraft.unit.Unit;

public class GroundUnit extends Unit {
    protected GroundUnit(int atk, int defense) {
        super(atk, defense);
    }

    @Override
    public void attack(Unit unit) throws NullPointerException{
        if (this instanceof AllRounder || unit instanceof GroundUnit) {
            unit.attacked(super.getAtk());
        }else if(unit instanceof AirUnit){
            throw new NullPointerException("공중 유닛은 공격할 수 없습니다.");
        }
    }
}
