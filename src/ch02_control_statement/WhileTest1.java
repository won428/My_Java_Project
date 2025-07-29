package ch02_control_statement;

public class WhileTest1 {
    public static void main(String[] args) {
        int i = 1;
        int dan = 3;
        System.out.println("몇 단을 출력할까요? " + dan + "단");

        while(i < 10){
            System.out.println(dan + " * " + i + " = " + i * dan);
            i++;
        }
    }
}
