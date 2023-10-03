package org.nhnStarcraft.GameOperator;

import java.util.Random;
import java.util.Scanner;
import org.nhnStarcraft.unit.tribe.Zerg;

public class GameOperatorShell {
    public static void main(String[] args) {
        GameOperator gameOperator = new GameOperator();


        // 유저 종족 선택 후 유닛 배정
        Player player = createPlayer();
        Player computer = new Player("computer",(int)(Math.random() * 3));
        player.bring(gameOperator.provideUnitOnField(player.getTribe()));
        computer.bring(gameOperator.provideUnitOnFieldForComputer(computer.getTribe()));


        while(true){
            System.out.println(computer);
            System.out.println(player);
            //attack에 넣기.

            player.attack(gameOperator.getUnits());
            if(player.isDone() || computer.isDone()){
                return;
            }
            computer.computerAttack(gameOperator.getUnits());

            if(player.isDone() || computer.isDone()){
                return;
            }
        }
    }

    private static Player createPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("플레이어 이름을 입력하세요 -> ");
        String name = sc.next();
        System.out.println("종족을 입력하세요 ->  Zerg : 0, Terran : 1, Protos: 2");
        int tribe = sc.nextInt();

        if (tribe < 0 || tribe > 2) {
            throw new IllegalArgumentException("0에서 2사이의 숫자를 입력하세요");
        }

        return new Player(name,tribe);
    }
}
