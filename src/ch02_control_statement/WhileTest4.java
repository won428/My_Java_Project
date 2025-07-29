package ch02_control_statement;

import java.util.Scanner;

public class WhileTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int total = 0;

        while (true) {
            System.out.print("점수 입력 : ");
            int grade = scan.nextInt();
            if (grade < -10 || grade == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (grade < 0) {
                grade = -grade;
            }
            count += 1;
            total += grade;
        }
        if (count > 0) {
            double average = (double) total / count;
            System.out.println("총 시험 빈도(회수) : " + count);
            System.out.println("총점 : " + total);
            System.out.println("평균 : " + average);
        } else {
            System.out.println("입력된 유효 점수가 없습니다.");
        }



    }
}
