package ch05_package.inheritance.mybeverage;

public class Espresso04 extends Beverage04{
    private int shotCount;
    public Espresso04(String name, double price, int shotCount){
        super(name,price);
        this.shotCount =  shotCount;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("샷의 개수 : " + shotCount);
    }

    public void dirnkEspresso(){
        String message = "맛이 진하고 강렬한 " + super.getName() + "을 마십니다.";
        System.out.println(message);
        System.out.println();
    }
    @Override
    public String toString(){
        String message = ", 샷 추가 : " + this.shotCount + "개";
        return super.toString() + message;
    }

}
