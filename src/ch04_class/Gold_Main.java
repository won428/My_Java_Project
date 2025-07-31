package ch04_class;

import java.util.Scanner;

public class Gold_Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Gold make = new Gold();
        String[] flower_pot_parts = {make.getFlower_name(), make.getSand_name(), make.getWood_name()};
        String[] iron_Axe_parts = {make.getIron_name(), make.getWood_name()};


        int x = 1;
        while(x != 0){
        System.out.print("원하는 품목을 선택하세요. 꽃 나무 화분은 '1', 나무 도끼는 '2', 프로그램 종료는 '0'을 입력해주세요 : ");
         x  = scan.nextInt();
        while (x == 1 || x == 2) {
            if (x == 1) {
                    System.out.print("꽃의 가격을 입력하세요 : ");
                    double flower_price = scan.nextDouble();
                    make.setFlower(flower_price);
                    System.out.print("모래의 가격을 입력하세요 : ");
                    double sand_price = scan.nextDouble();
                    make.setSand(sand_price);
                    System.out.print("나무의 가격을 입력하세요 : ");
                    double wood_price = scan.nextDouble();
                    make.setWood(wood_price);
                    System.out.print("제작 수수료를 입력하세요 : ");
                    double flower_pot_fee_price = scan.nextDouble();
                    make.setFlower_pot_fee(flower_pot_fee_price);
                    System.out.print("꽃 나무화분의 가격을 입력하세요 : ");
                    double flower_pot_price = scan.nextDouble();
                    make.setFlower_pot(flower_pot_price);

                    System.out.print("재료 목록은 ");
                    for (int i = 0; i < flower_pot_parts.length; i++) {
                        if (i == flower_pot_parts.length - 1) {
                            System.out.print(flower_pot_parts[i]);
                        } else {
                            System.out.print(flower_pot_parts[i] + ", ");
                        }
                    }
                    System.out.print("이고 수수료는 " + make.getFlower_pot_fee() + "원 입니다. ");

                    System.out.println(make.getMake_flower_pot());


                    System.out.print("프로그램 종료는 '0', 계속하시려면 '1', 다름 품목을 검색하시려면 '3'을 입력해주세요 : ");
                    x = scan.nextInt();

            } else if (x == 2) {
                    System.out.print("철의 가격을 입력하세요 : ");
                    double iron_price = scan.nextDouble();
                    make.setIron(iron_price);
                    System.out.print("나무의 가격을 입력하세요 : ");
                    double wood_price = scan.nextDouble();
                    make.setWood(wood_price);
                    System.out.print("제작 수수료를 입력하세요 : ");
                    double wood_Axe_fee_price = scan.nextDouble();
                    make.setWood_Axe_fee(wood_Axe_fee_price);
                    System.out.print("나무 도끼의 가격을 입력하세요 : ");
                    double wood_Axe_price = scan.nextDouble();
                    make.setWood(wood_Axe_price);

                    System.out.print("재료 목록은 : ");
                    for (int i = 0; i < iron_Axe_parts.length; i++) {
                        if (i < iron_Axe_parts.length - 1) {
                            System.out.print(iron_Axe_parts[i] + ", ");
                        } else {
                            System.out.print(iron_Axe_parts[i]);
                        }
                    }
                    System.out.print("이고 수수료는 " + make.getWood_Axe_fee() + "원 입니다. ");
                    System.out.println(make.make_Wood_Axe());
                    System.out.print(" 프로그램 종료는 '0', 계속하시려면 '2', 다름 품목을 검색하시려면 '3'을 입력해주세요 : ");
                    x = scan.nextInt();
            }
        }
        }
    }
}
