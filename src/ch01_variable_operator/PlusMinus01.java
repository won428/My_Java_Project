package ch01_variable_operator;

public class PlusMinus01 {
    public static void main(String[] args) {
        int a = 10, b = 20, c ;

        c = ++a + b++;
        // ++, --가 좌측에 있으면 순서가 첫번째이고, 우측에 있으면 제일 마지막이다.
        // ++ = 증감 연산자, 이미 할당된 결과값과 b는 따로 할당됨 ex ) 계산 순서에 따라 이미 c에는 31이 할당되어 있음.
        System.out.println("a : " + a); // 11
        System.out.println("b : " + b); // 21
        System.out.println("c : " + c); // 31


        c = a++ + --b;
        // 계산 순서 : -- , + , = , ++ 순으로 계산된다.
        // 위 계산에서 누적
        System.out.println("a : " + a); // 12
        System.out.println("b : " + b); // 20
        System.out.println("c : " + c); // 31

        a = 15;
        b = 12;

        c = --a + --b;
        // 계산 순서 : --a, --b, + , =
        System.out.println("a : " + a); // 14
        System.out.println("b : " + b); // 11
        System.out.println("c : " + c); // 25


        a = 10;
        b = 20;
        ++a; // a = 1 + 10 = 11
        b--; // b = 20 - 1 = 19, ;으로 끝맺으면 전위, 후위 상관없이 할당이 완료됨. 그래서 밑의 계산식에서 b는 19로 계산
        c = ++a + b--; // 계산 순서 : ++a , + , = , b--
        System.out.println("a : " + a); // 12
        System.out.println("b : " + b); // 18
        System.out.println("c : " + c); // 31



    }
}
