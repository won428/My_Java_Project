package ch05_package.inheritance.practice;

public abstract class P_Animal {
    private String name;

    P_Animal(String name){
        this.name = name;
    }

    public abstract void breath();
}
