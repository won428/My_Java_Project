package ch05_package.inheritance.mybeverage;

public class InheTest04 {
    public static void main(String[] args) {
        // 클래스이름 객체이름 = new 생성자이름();

        // 승급(업캐스팅) : 서브 클래스가 일시적으로 슈퍼클래스의 타입으로 변환이 되는 과정
        Beverage04 beverage01 = new Americano04("아메리카노", 4000.0, 250.0);

        // 슈퍼 클래스 내에 있는 메소드는 상속이라는 개념에 의하여 접근이 가능합니다.
        beverage01.showInfo();

        // 승급시 서브 클래스내의 변수와 매소드는 일시적으로 접근을 하지 못하도록 설계되어 있습니다.
        // 강등(다운캐스팅) : 타입이 슈퍼타입으로 변환되어있는 서브클래스의 타입을 원래 타입으로 변환이 되는 과정
        // 단, 강등을 하게되면 서브 클래스 내의 변수와 메소드를 접근 할 수 있습니다.
        Americano04 ame = (Americano04) beverage01 ;
        ame.sipAmericano();

        
    }
}
