package org.nhn.unit;

//Unit의 틀
public abstract class Unit {
    protected int atk;

    public void setDefense(int defense) {
        this.defense = defense;
    }

    protected int defense;

    public int getAtk() {
        return this.atk;
    }

    public int getDefense() {
        return this.defense;
    }

    protected Unit(int atk, int defense) {
        this.atk = atk;
        this.defense = defense;
    }

    abstract public boolean attack(Unit unit);
    abstract public boolean attacked(int damage);

    abstract public boolean canFly();
}
