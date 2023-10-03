package org.nhnStarcraft.GameOperator;

import org.nhnStarcraft.unit.Unit;

public class UnitOnField {
    public UnitOnField(Unit[] units) {
        this.units = units;
    }

    public Unit[] getUnits() {
        return units;
    }

    private Unit[] units;

    public int getListSize() {
        int count = 0;
        for (int i = 0; i < units.length; i++) {
            if (units[i] != null) {
                count++;
            }
        }
        return count;
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


    //매 턴마다 defense가 0이면 삭제
    public void deleteUnit(){
        for (int i = 0; i < this.units.length; i++) {
            if (this.units[i] != null &&  this.units[i].getDefense() <= 0) {
                this.units[i] = null;
            }
        }
    }
}
