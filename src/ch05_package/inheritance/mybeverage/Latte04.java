package ch05_package.inheritance.mybeverage;

public class Latte04 extends Beverage04 {
    private String milkType;

    public Latte04(String name, double price, String milkType) {
        super(name, price);
        this.milkType = milkType;
    }

    public void enjoyLatte() {
        String message = "음 맛있다~";
        System.out.println(message);
    }

    @Override
    public String toString(){
        String message = ", 우유의 타입 : " + this.milkType;
        return super.toString() + message;
    }
}
