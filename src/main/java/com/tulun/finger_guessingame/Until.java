package com.tulun.finger_guessingame;

import java.util.Scanner;

/**
 * @author:liguozheng
 * @Date:2018/12/8
 * @time:12:59
 * @description:
 */
@SuppressWarnings("all")
public class Until {

    Player player1;
    Player player2;

    public Until() {

        this.player1 = new Player("玩家1",0,null);
        this.player2 = new Player("玩家2",0,null);
    }

    public void start(){

        Scanner scanner = new Scanner(System.in);
        printMenu();
        int k = scanner.nextInt();
        Boolean mark;
        if (k==1){
            mark = true;
        }else {
            mark = false;
        }
        while (mark){

            int time = 0;

            while (time<3){
                System.out.println("玩家1请输入（a:石头,b:剪刀,c:布）：");
                player1.setInPut(scanner.next());
                System.out.println("玩家2请输入（a:石头,b:剪刀,c:布）：");
                player2.setInPut(scanner.next());
                Player player = countWon(player1, player2);
                if (player==player1){
                    player1.setScore(player1.getScore()+1);
                }else if (player==player2){
                    player2.setScore(player2.getScore()+1);
                }
                time++;
            }
            if (player1.getScore()>player2.getScore()){
                System.out.println(player1.getName()+" 获胜");

            }else if (player1.getScore()<player2.getScore()){
                System.out.println(player2+" 获胜");
            }else {
                System.out.println("平局");
            }

            System.out.println("是否继续游戏？（y/n）");
            String next = scanner.next();
            mark = next.contains("y") ? true : false;
            player1.setScore(0);
            player2.setScore(0);
        }
    }

    public void printMenu(){
        System.out.println("     猜拳游戏     ");
        System.out.println("     1.开始        ");
        System.out.println("     2.退出       ");
        System.out.println("                   ");
        System.out.println("请输入标号：");
    }

    public Player countWon(Player player1,Player player2){

        if (player1.getInPut().contains("a")&&player2.getInPut().contains("b")){
            return player1;
        }else if (player1.getInPut().contains("a")&&player2.getInPut().contains("c")){
            return player2;
        }else if(player2.getInPut().contains("a")&&player1.getInPut().contains("b")){
            return player2;
        }else if (player2.getInPut().contains("a")&&player1.getInPut().contains("c")){
            return player1;
        }else if (player1.getInPut().contains("b")&&player2.getInPut().contains("c")){
            return player1;
        }else if (player2.getInPut().contains("b")&&player1.getInPut().contains("c")){
            return player2;
        }else {
            return null;
        }
    }
}
