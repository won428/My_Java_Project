package ch06_abstract_interface.practice;

import java.util.Scanner;

public class Americano extends JavaCafe {

    Scanner scan = new Scanner(System.in);

    public Americano(String name, double price){
        super(name, price);
    }

    @Override
    public boolean make(){
        System.out.println("넣으실 물의 양을 입력해주세요");
        double water = scan.nextDouble();
        System.out.println("넣으실 샷의 개수를 입력해주세요");
        int shot = scan.nextInt();
    return true;
    }

}
