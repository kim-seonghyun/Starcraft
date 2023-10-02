package org.nhn.unit;

//Unit의 틀
public class Unit {
    private final int atk;
    private int defense;


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
