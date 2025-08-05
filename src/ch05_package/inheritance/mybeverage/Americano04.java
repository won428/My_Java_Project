package ch05_package.inheritance.mybeverage;

public class Americano04 extends Beverage04{
    private double waterAmount;
    Americano04(String name, double price, double waterAmount){
        super(name, price);
        this.waterAmount = waterAmount;
    }
   @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("물의 양 : " + waterAmount);
    }

    public void sipAmericano(){
       String message = "아메리카노를 홀짝 마십니다.";
        System.out.println(message);
        System.out.println();
    }

@Override
    public String toString(){
        String message = ", 물량 : " + this.waterAmount + "mL";
        return super.toString() + message;

}

}
