package ch06_abstract_interface.practice;

import java.util.Scanner;

public class JavaCafeMain {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        JavaCafe[] javaCafe = {
                new Americano("아메리카노", 5000),
                new Bingsu("팥빙수", 12000),
                new CafeLatte("카페라떼", 6000)
        };

        int x = 1;
        while(x != 0){

            boolean going = javaCafe[1].make();
            if(!going){
                break;
            }
            System.out.print("계속하기를 원하신다면 '1', 종료는 '0'을 눌러주세요 :");
            x = scan.nextInt();

        }
    }
}
