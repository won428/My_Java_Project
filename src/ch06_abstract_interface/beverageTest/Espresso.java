package ch06_abstract_interface.beverageTest;

public class Espresso extends Beverage{



    public Espresso(String name, double price, int shotcount){
        super(name, price, shotcount);
    }

    public String makedrink(){
        String message = super.name + "의 제조방법은 컵에 추출한 에스프레소 샷" + super.shotcount + "개를 넣습니다.";
        System.out.println(message);
        return message;
    };
}
