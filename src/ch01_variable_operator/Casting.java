package ch01_variable_operator;

public class Casting {
    public static void main(String[] args) {
        double d = 100; // 100.0으로 출력, 암시적(암묵적) 형변환으로 자바 자체 프로그램으로 변환
        System.out.println("d : " + d);

        int i = (int)12.5; // 12로 출력, 명시적 형변환으로 개발자가 직접 캐스팅하여 변환
        System.out.println("i = " + i);

        System.out.println(14/5); // 정수와 정수의 연산 결과값은 정수 ( 자바 프로그램 특징 )

        System.out.println((double)14/5); // 먼저 14가 14.0으로 명시적 형변환인 (double)로 인해서 14.0(실수)로 바뀌고, 5는 실수와 정수의 계산이 안되므로 암묵적 형변환으로 5.0으로 바뀐다. 그럼 두 수 모두 실수이므로 결과값은 2.8이 나온다. 이러한 방식은 식 자체를 실수끼리의 계산으로 바꾸고 싶을 때 사용한다.

        System.out.println((double)(14/5)); // 소괄호에 의해 산술연산인 14/5가 먼저 실행이 되어서 결과값은 2가 나온다. 그 결과값은 앞쪽의 (double)에 의해서 명시적 형변환이 되어 2.0이 된다. 이러한 방식은 결과값만 실수로 바꾸고 싶을 때 사용한다.

        int kor = 50, eng = 60, math = 80;
        int total = kor + eng + math;
        double average = (double)total/3; // 3을 3.0으로 바꿔도 무방하다. 목적값이 실수라면 처음부터 double로 하는것이 좋다.
        System.out.println("총점 : " + total);
        System.out.println("평균 : " + average);

        char ch1 = 'c';
        char ch2 = 'a';
        boolean bool1 = ch1 > ch2; // 암시적인 형변환에 의하여 자바 내부적으로 a는 97로 c는 99로 바뀌어서 계산된다.
        System.out.println("bool1 : " + bool1);

        int result;
        result = ch1 - ch2 + 5;
        System.out.println("result = " + result);

        char ch3 = 'D';
        String message;
        message = ch3 >= 'A' && ch3 <= 'Z' ? "대문자" : "소문자"; // ch3 >= 'A' && ch3 <= 'Z', ch3 < 'a'는 소문자와 대문자 사이에 다른 문자열이 있기 때문에 오류가 생길 수 있다.
        // A = 65, a = 97, 0 = 48
        System.out.println("대소문자 : " + message);




    }
}
