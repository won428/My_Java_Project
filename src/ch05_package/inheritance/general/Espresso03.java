package ch05_package.inheritance.general;

public class Espresso03 extends Beverage03{

    private int shot;

    public Espresso03(String name, double price, int shot) {
        //super();
        super(name,price);
        this.shot = shot;
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("샷의 개수 : " + shot);
        System.out.println();
    }

    @Override
    public void display(){
        super.display();
        System.out.println("샷의 개수 : " + shot);
        System.out.println();
    }
}
