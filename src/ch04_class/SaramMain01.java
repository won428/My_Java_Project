package ch04_class;

public class SaramMain01 {
    public static void main(String[] args) {
        int x ;
        // main 메서드 안의 변수이기 때문에 x는 지역변수이고, 그러므로 x는 기본값이 없다.
        // 지역변수는 기본값이 없기 떄문에 무조건 값을 초기화 해줘야 한다.

        // 단계 2 : 객체를 생성
        // 클래스이름 객체 이름 = new 생성자이름();
        Saram01 yusin = new Saram01();
        // 밑의 방법이 정석
        Saram01 soon;
        soon = new Saram01();

        // 단계 3 : 객체의 멤버 변수에 쓰기 작업
        // 점(.)을 멤버 참조 연산자라고 부릅니다.
        yusin.nationality = "대한민국";
        yusin.name = "김유신";
        yusin.height =  172.5;
        yusin.weight = 75.0;
        yusin.hobby = "당구";
        yusin.blood = "AB";

        // 단계 4 : 객체의 멤버 션수의 값을 출력
        System.out.println("국적 : " + yusin.nationality);
        System.out.println("이름 : " + yusin.name);
        System.out.println("키 : " + yusin.height);
        System.out.println("몸무게 : " + yusin.weight);
        System.out.println("취미 : " + yusin.hobby);
        System.out.println("혈액형 : " + yusin.blood);
        System.out.println();

        soon.nationality = "대한민국";
        soon.name = "유관순";
        soon.height = 168.5;
        soon.weight = 52.4;
        soon.hobby = "축구";
        soon.blood = "O";

        System.out.println("국적 : " + soon.nationality);
        System.out.println("이름 : " + soon.name);
        System.out.println("키 : " + soon.height);
        System.out.println("몸무게 : " + soon.weight);
        System.out.println("취미 : " + soon.hobby);
        System.out.println("혈액형 : " + soon.blood);

        yusin.showGenderinfo(1);
        soon.showGenderinfo(2);
        yusin.showbmiInfo();
        soon.showbmiInfo();
        yusin.display();
        soon.display();



    }
}
