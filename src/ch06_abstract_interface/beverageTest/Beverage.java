package ch06_abstract_interface.beverageTest;

public abstract class Beverage {
    protected String name;
    protected double price;
    protected int shotcount;

    public Beverage(String name, double price, int shotcount){
        this.name = name;
        this.price = price;
        this.shotcount = shotcount;
    }

    protected final void showdata(){
        System.out.println("메뉴명 : " + name);
        System.out.println("단가 : " + price);
    }
    
    public abstract String makedrink(); 




}
