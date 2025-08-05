package ch06_abstract_interface.practice;

import java.util.Scanner;

// 변수 : 메뉴명, 가격, 물, 에스프레소 샷, 우유, 얼음, 팥, 떡
// 추상메소드 : 메뉴 정보 출력, 메뉴 판매
// 인터페이스 : 컵준비, 물따르기, 에스프레소 샷 뽑기, 우유 따르기, 얼음관련 메소드, 팥, 떡
public abstract class JavaCafe {

    Scanner scan = new Scanner(System.in);

    protected String name;
    protected double price;
    protected double total = 0;

    public JavaCafe(String name, double price){
        this.name = name;
        this.price = price;
    }

    public abstract boolean make();

}
