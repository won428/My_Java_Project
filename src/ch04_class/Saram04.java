package ch04_class;

import java.util.Scanner;

public class Saram04 {
    private String name;
    private double height;
    private double weight;
    private String hobby;
    private String blood;

    Scanner scan = null; // scan 변수 선언

    public Saram04(){
        this.name = "김철수";
        scan = new Scanner(System.in); // scan 변수 초기화
    }

    public Saram04(String name, double height, double weight, String hobby, String blood){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.hobby = hobby;
        this.blood = blood;
    }

    public Saram04(String name, double height, double weight, String blood) {
        this.name =  name;
        this.height = height;
        this.weight = weight;
        this.hobby = "볼링";
        this.blood = blood;
    }


    public void display() {
        System.out.println("이름 : " + this.name);
        System.out.println("키 : " + this.height);
        System.out.println("몸무게 : " + this.weight);
        System.out.println("취미 : " + this.hobby);
        System.out.println("혈액형 : " + this.blood);
        System.out.println();

        /*if (scan != null) {
            System.out.print("정수 입력 : ");
            int su = this.scan.nextInt();
            System.out.println("입력된 정수 : " + su);
        }*/
    }
}
