package ch06_abstract_interface.beverageTest;

public class Americano extends Beverage{


    double water;

    public Americano(String name, double price, int shotcount, double water){
        super(name, price, shotcount);
        this.water = water;
    }

    @Override
    public String makedrink(){
      String message = super.name + "의 제조방법은 물" + water + "mL에 추출한 에스프레소 샷" + super.shotcount + "개를 넣습니다.";
        System.out.println(message);
        return message;
    };

}
