package ch06_abstract_interface.car;


// 자동차의 키의 유형을 정의해놓은 열거형(Enumeration) 상수
public enum Key {
    KEY("열쇠키"), SMART("스마트키");

    private  String name;

    Key(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
