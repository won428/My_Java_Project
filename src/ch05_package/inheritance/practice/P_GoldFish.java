package ch05_package.inheritance.practice;

public class P_GoldFish extends P_Animal{
    P_GoldFish(String name) {
        super(name);
    }

    @Override
    public void breath() {
        System.out.println("금붕어는 아가미를 이용해 호흡합니다.");
    }
}
