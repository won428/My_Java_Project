package ch05_package.inheritance.product;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public void make(){
        System.out.println("제작울품의 이름은 " + name + "이고 ");
    }

}
