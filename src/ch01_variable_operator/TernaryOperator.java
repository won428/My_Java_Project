package ch01_variable_operator;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 3, b = 5;
        int result = a >= b ? a - b : -(a - b); // 조건식 ? 참일때 : 거짓일때 ( 조건 연산자, 3항 연산자 )
        System.out.println("절대값 : " + result);


        int x = 10; // 짝수면 +3 , 홀수면 제곱
        result = x%2 == 0 ? x + 3 : (int)Math.pow(x,2);
        System.out.println("result : " + result);


        x = 8;
        int y = 10;
        result = x >= y ? x : y; // 둘 중에 더 큰 숫자
        System.out.println("result : " + result);


        result  = x <= y ? x : y; // 둘 중에 더 작은 숫자
        System.out.println("result : " + result);

        x = 5;
        y = 10;
        String result2;
        result2 = y%x == 0 ? "yes" : "no";
        System.out.println("result : " + result2);

        int su = 10;
         // 숫자 7은(는) 홀수입니다.
        String message;
        message = su%2 != 0 ? "홀수" : "짝수";
        System.out.println("숫자 " + su + "은(는) " + message + "입니다.");

        int score =  55;
        message = score >= 60 ? "합격" : "불합격";
        System.out.println(score + "점이므로 " + message + "입니다.");
         // 60점 이상이면 합격.
        //85점이므로 합격입니다.

        x = 3;
        y = 8;
        int z = 10;
        int max = x > y ? x : y;
        max = max > z ? max : z;
        System.out.println("max : " + max);

        int min = x < y ? x : y;
        min = min < z ? min : z;
        System.out.println("min : " + min);



    }
}
