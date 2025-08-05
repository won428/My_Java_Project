package ch06_abstract_interface.practice;

import java.util.Scanner;

public class CafeLatte extends JavaCafe{

    Scanner scan = new Scanner(System.in);

    public CafeLatte(String name, double price){
        super(name, price);
    }

    @Override
    public boolean make() {
        return true;
    }
}
