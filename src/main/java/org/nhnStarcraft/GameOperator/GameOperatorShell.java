package org.nhnStarcraft.GameOperator;

import java.util.Random;
import java.util.Scanner;
import org.nhnStarcraft.unit.tribe.Zerg;

public class GameOperatorShell {
    public static void main(String[] args) {
        GameOperator gameOperator = new GameOperator();


        // 유저 종족 선택 후 유닛 배정
        Player player = createPlayer();
//        Player computer = new Player("computer",(int)(Math.random() * 3) );
        Player computer = new Player("computer");
        player.bring(gameOperator.provideUnitOnField());
        computer.bring(gameOperator.provideUnitOnFieldForComputer((int) (Math.random() *3)));


        while(true){
            System.out.println(computer);
            System.out.println(player);
            //attack에 넣기.

            player.attack(gameOperator.getUnits());
            computer.attack(gameOperator.getUnits());

            if(player.isDone() || computer.isDone()){
                return;
            }
        }
    }

    private static Player createPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("플레이어 이름을 입력하세요 -> ");
        String name = sc.next();
        return new Player(name);
    }
}
