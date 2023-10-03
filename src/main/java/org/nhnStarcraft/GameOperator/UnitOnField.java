package org.nhnStarcraft.GameOperator;

import java.util.Arrays;
import org.nhnStarcraft.unit.Unit;

public class UnitOnField {
    public UnitOnField(Unit[] units) {
        this.units = units;
    }

    private Unit[] units;

    public int getListSize() {
        return units.length;
    }

    public void attacked( int index, int damage){
        try {
            Unit attackedUnit = this.units[index];
            attackedUnit.setDefense(attackedUnit.getDefense() - damage);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.units.length; i++) {
            if (this.units[i] == null) {
                continue;
            }
            sb.append(i).append(". ").append(this.units[i].toString());
        }
        return sb.toString();
    }

    public int getDamage(int index) {
        try {
            return this.units[index].getAtk();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }

    //매 턴마다 defense가 0이면 삭제
    public void deleteUnit(){
        for (int i = 0; i < this.units.length; i++) {
            if (this.units[i].getDefense() < 0) {
                this.units[i] = null;
            }
        }
    }
}
