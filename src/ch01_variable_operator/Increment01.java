package ch01_variable_operator;

public class Increment01 {
    public static void main(String[] args) {
        int x = 5;

        x += 3; // 기존값에 누적 , 풀어 쓰면 x = x + 3
        System.out.println("x : " + x);

        x *= 4; // 기존값에 누적 (바로 직전 결과 값에 누적), 풀어 쓰면 x = x * 4
        System.out.println("x : " + x);

        x %= 5; // x = x % 5
        System.out.println("x : " + x);

        x -= 1; // x = x - 1
        System.out.println("x : " + x);

        x += 7; // x = x + 7
        System.out.println("x : " + x);

    }
}
