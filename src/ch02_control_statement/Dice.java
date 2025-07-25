package ch02_control_statement;

public class Dice {
    public static void main(String[] args) {
        // 주사위가 1 또는 4,5,6 이면 승리, 2, 3이면 패배
        int dice = 6;
        if(dice==1 || dice >=4){
            System.out.println("승리");
        }else{
            System.out.println("패배");
        }
    }
}
