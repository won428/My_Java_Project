package ch04_class;

import java.util.Scanner;

public class GoldMain2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Gold2[] product = new Gold2[2];

        while(true) {
            System.out.print("꽃 화분들의 정보를 입력하려면 '1', 나무 도끼의 정보를 입력하려면 '2', 프로그램 종료는 '0' : ");
            int x = scan.nextInt();
            if (x == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            if(x == 1) {
                for (int i = 0; i < product.length; i++) {
                    System.out.print("꽃 화분의 꽃 이름을 입력하세요 : ");
                    String name = scan.next();
                    System.out.print("해당 화분에 들어가는 꽃의 가격을 입력하세요 : ");
                    double flower = scan.nextDouble();
                    System.out.print("모래의 가격을 입력하세요 : ");
                    double sand = scan.nextDouble();
                    System.out.print("나무의 가격을 입력하세요 : ");
                    double wood = scan.nextDouble();
                    System.out.print("수수료를 입력하세요 : ");
                    double fee = scan.nextDouble();
                    System.out.print("해당 꽃 화분의 가격을 입력하세요 : ");
                    double flower_pot = scan.nextDouble();
                    product[i] = new Gold2(name, flower, sand, wood, fee, flower_pot);
                }
                for (int i = 0; i < product.length; i++) {
                    product[i].make_flower_pot();
                }
            }else if(x == 2) {
                System.out.print("철의 가격을 입력하세요 : ");
                double iron = scan.nextDouble();
                System.out.print("나무의 가격을 입력하세요 : ");
                double wood = scan.nextDouble();
                System.out.print("수수료를 입력하세요 : ");
                double fee = scan.nextDouble();
                System.out.print("나무 도끼의 가격을 입력하세요 : ");
                double wood_Axe = scan.nextDouble();
                Gold2 product2 = new Gold2(iron, wood, fee, wood_Axe);
                product2.make_wood_Axe();
            }else{
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }

        }
    }
}
