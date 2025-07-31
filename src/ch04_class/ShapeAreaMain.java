package ch04_class;

import java.util.Scanner;

public class ShapeAreaMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ShapeArea obj = new ShapeArea();
        //메소드 오버로딩
        while (true) {
            System.out.print("구하고 싶은 도형의 면적을 고르세요. 원은 '1', 사각형은 '2', 사다리꼴은 '3', 프로그램 종료는 '0'을 입력해주세요 : ");
            int set = scan.nextInt();
            if (set == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
                switch (set) {
                    case 1:
                        System.out.print("원의 반지름 : ");
                        int x = scan.nextInt();
                        obj.area(x); // 원
                        break;
                    case 2:
                        System.out.print("사각형의 밑변 : ");
                        int a = scan.nextInt();
                        System.out.print("사각형의 높이 : ");
                        int b = scan.nextInt();
                        obj.area(a, b); // 사각형
                        break;
                    case 3:
                        System.out.print("사다리꼴의 윗변 : ");
                        int c = scan.nextInt();
                        System.out.print("사다리꼴의 아랫변 : ");
                        int d = scan.nextInt();
                        System.out.print("사다리꼴의 높이 : ");
                        int e = scan.nextInt();
                        obj.area(c, d, e); // 사다리꼴
                        break;
                }
        }
    }
}
