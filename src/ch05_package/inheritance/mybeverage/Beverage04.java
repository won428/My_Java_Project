package ch05_package.inheritance.mybeverage;

public class Beverage04 {
    private String name;
    private double price;

    public Beverage04(){

    }

    void showInfo(){
        System.out.println("이름 : " + name);
        System.out.println("단가 : " + price);
    }

    public Beverage04(String name, double price){
        this.name = name;
        this.price = price;
    }

}
