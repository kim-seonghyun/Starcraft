package org.nhnStarcraft.unit;

//Unit의 틀
public class Unit {
    private final int atk;
    private int defense;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append(" (현재 방어력: ").append(this.getDefense()).append(") \n");
        return sb.toString();
    }

    public int getAtk() {
        return this.atk;
    }

    public int getDefense() {
        return this.defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    protected Unit(int atk, int defense) {
        this.atk = atk;
        this.defense = defense;
    }

    public void attack(Unit unit) {
        unit.attacked(this.getAtk());
    }

    public void attacked(int damage){
        this.setDefense(this.getDefense() - damage);
    }

}
