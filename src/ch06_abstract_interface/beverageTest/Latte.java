package ch06_abstract_interface.beverageTest;

public class Latte extends Beverage{

    double milk;
    public Latte(String name, double price, int shotcount, double milk){
        super(name, price,shotcount);
        this.milk = milk;
    }

    public String makedrink(){
        String message = super.name + "의 제조방법은 컵에 우유 " + milk + "mL와 추출한 에스프레소 샷" + super.shotcount + "개를 넣습니다.";
        System.out.println(message);
        return message;
    };


}
