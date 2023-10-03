package org.nhnStarcraft.GameOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import org.nhnStarcraft.unit.tribe.Zerg;

public class Player {
    private String name;
    private int tribe;

    private UnitOnField myUnitOnField;

    public Player(String name) {
        this.name = name;
    }

    private String getTribeString(int n) {
        switch (n) {
            case 0: return "Zerg";
            case 1:
                return "Terran";
            case 2:
                return "Protos";
            default:
                return null;
        }
    }

    public void bring(UnitOnField unitOnField) {
        this.myUnitOnField = unitOnField;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (Objects.equals(this.name, "computer")) {
            sb.append("적군: ");
        }else{
            sb.append("아군: ");
        }
        sb.append(getTribeString(this.tribe)).append("\n");
        sb.append(this.myUnitOnField.toString());
        return sb.toString();
    }

    public void attack(List<UnitOnField> enemyUnitOnField) {
        System.out.println("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요: ");
        Scanner sc = new Scanner(System.in);
        int myUnitIndex = sc.nextInt();
        int enemyUnitIndex = sc.nextInt();
        UnitOnField enemy = null;
        // 입력 받아서 공격
        for (UnitOnField unitOnField : enemyUnitOnField) {
            if (unitOnField != this.myUnitOnField) {
                enemy = unitOnField;
            }
        }
        enemy.attacked(enemyUnitIndex, this.myUnitOnField.getDamage(myUnitIndex));
        // defense가 0인 유닛들 삭제.
        enemy.deleteUnit();
    }


    public boolean isDone() {
        if (myUnitOnField.getListSize() == 0) {
            System.out.println(this.name + "의 패배입니다.");
            return true;
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public int getTribe() {
        return tribe;
    }

    public UnitOnField getMyUnitOnField() {
        return myUnitOnField;
    }


}