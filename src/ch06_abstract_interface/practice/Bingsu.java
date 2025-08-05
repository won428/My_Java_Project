package ch06_abstract_interface.practice;

import java.util.Scanner;

public class Bingsu extends JavaCafe{

    Scanner scan = new Scanner(System.in);


    public Bingsu(String name, double price){
        super(name, price);
    }

    @Override
    public boolean make() {
        System.out.println("얼음을 선택해주세요");
        System.out.print("1. 간 얼음  2. 일반 얼음 : ");
        int ice = scan.nextInt();
        System.out.println("토핑을 선택해주세요");
        System.out.print("1. 팥  2. 완두콩 : ");
        int bean = scan.nextInt();
        if(ice == 1 && bean == 1){
            System.out.println("완벽한 팥빙수 입니다 ! 당신은 팥빙수를 팔아서 " + super.price + "원을 벌었습니다.");
            super.total += super.price;
        }else if(ice == 1 && bean ==2){
            System.out.println("당신은 세상에 존재하면 안될 완두콩 빙수를 만들었습니다..손님에게 " + super.price +"원을 지불합니다.");
            super.total -= super.price;
        }else if(ice == 2 && bean == 2){
            System.out.println("당신은 얼음과 완두공을 이용해 완두콩 스무디를 만들어냈습니다! 하지만 구매하는 손님이 없군요.");
            super.total += super.price;
        }else{
            System.out.println("존재하지 않는 제조법 입니다.");
        }
        System.out.println("내 지갑 : " + total);

        if(super.total < -50000){
            System.out.println("파산입니다.");
            return false;
        }

    return true;
    }
}
