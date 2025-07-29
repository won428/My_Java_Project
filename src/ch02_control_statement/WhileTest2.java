package ch02_control_statement;

import java.util.Scanner;

public class WhileTest2 {
    public static void main(String[] args) {
        // 스캐너 장치 준비
        Scanner scan = new Scanner(System.in);
        int total = 0;
        double average = 0.0;
        int count = 0;
        while(true){
            System.out.print("점수 입력 : ");
            int grade = scan.nextInt();
            if (grade <= 0){
                System.out.println("점수 입력값이 음수거나 0이어서 종료합니다.");
                break;
            }
            total += grade;
            count += 1;
            System.out.println("총점 : " + total);

        }
        average = (double) total / count;
        System.out.println("총점 : " + total);
        System.out.println("시험 시행 횟수 : " + count);
        System.out.println("평균 : " + average);
    }
}
