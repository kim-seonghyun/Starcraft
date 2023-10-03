package org.nhnStarcraft.GameOperator;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import org.nhnStarcraft.unit.Unit;

public class Player {
    private String name;
    private int tribe;

    private UnitOnField myUnitOnField;

    public Player(String name, int tribe) {
        this.name = name;
        this.tribe = tribe;
    }

    private String getTribeString() {
        switch (this.tribe) {
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
        sb.append(this.getTribeString()).append("\n");
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
        try {
            this.myUnitOnField.getUnits()[myUnitIndex].attack(enemy.getUnits()[enemyUnitIndex]);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("유닛을 다시 선택하세요");
            this.attack(enemyUnitOnField);
        }

        // defense가 0인 유닛들 삭제.
        enemy.deleteUnit();
    }

    public void computerAttack(List<UnitOnField> enemyUnitOnField) {
        System.out.println("공격을 수행할 아군 유닛과 공격할 적군 유닛을 선택하세요: ");
        Unit[] myUnit = myUnitOnField.getUnits();
        int myUnitIndex =0 ;
        int enemyUnitIndex = 0 ;
        for (int i = 0; i < myUnit.length; i++) {
            if(myUnit[i] != null){
                myUnitIndex = i;
            }
        }
        UnitOnField enemy = null;
        for (UnitOnField unitOnField : enemyUnitOnField) {
            if (unitOnField != this.myUnitOnField) {
                enemy = unitOnField;
            }
        }
        Unit[] enemyUnit = enemy.getUnits();

        for (int i = 0; i < enemyUnit.length; i++) {
            if(enemyUnit[i] != null){
                enemyUnitIndex = i;
            }
        }

        // 입력 받아서 공격
        for (UnitOnField unitOnField : enemyUnitOnField) {
            if (unitOnField != this.myUnitOnField) {
                enemy = unitOnField;
            }
        }
        try {
            this.myUnitOnField.getUnits()[myUnitIndex].attack(enemy.getUnits()[enemyUnitIndex]);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            System.out.println("유닛을 다시 선택하세요");
            this.computerAttack(enemyUnitOnField);
        }

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


}