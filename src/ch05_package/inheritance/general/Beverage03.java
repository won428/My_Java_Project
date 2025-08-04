package ch05_package.inheritance.general;

public class Beverage03 {
    private String name; //이름
    private double price; //단가

     public Beverage03(String name, double price){
       this.name = name;
       this.price = price;
    }

    public void showInfo(){
        System.out.println("메뉴명  : " + this.name);
        System.out.println("가격 : " + this.price);
    }


    public void display(){
        System.out.println("메뉴명 : " + this.name);
        System.out.println("가격 : " + this.price);
    }
}
