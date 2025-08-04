package ch05_package.inheritance.general;
//       서브클래스  extends(상속 명령어) 슈퍼클래스
public class Americano03 extends Beverage03 {
    private double water; //투입하는 물의양

    public Americano03(String name, double price, double water) {
        //super();
        super(name, price);
        this.water = water;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("물의 양 : " + this.water);
        System.out.println();
    }

    public void printInfo() {
        super.showInfo();
        System.out.println("투입된 물의 양 : " + this.water);
        System.out.println();
    }
}

