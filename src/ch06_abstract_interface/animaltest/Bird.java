package ch06_abstract_interface.animaltest;

public interface Bird {
    int speed = 300; // public static final이 암시적으로 붙어있음


    void fly();

    default void flutter(){ // 기본 동작 정의
        System.out.println("날개를 펄럭입니다.");
     }

}
