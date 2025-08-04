package ch05_package.inheritance.product;

public class FlowerPot extends Product{
    double flower;
    double sand;
    double wood;

    public FlowerPot(String name, double price, double flower, double sand, double wood){
        super(name, price);
        this.flower = flower;
        this.sand = sand;
        this.wood = wood;
    }



}

