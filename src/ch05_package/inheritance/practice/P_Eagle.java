package ch05_package.inheritance.practice;

public class P_Eagle extends P_Animal implements Fly{

    public P_Eagle(String name){
        super(name);
    }

    @Override
    public void breath(){
        System.out.println("독수리는 폐로 호흡합니다.");
    }

    @Override
    public void fly(){
        System.out.println("독수리는 날 수 있습니다.");
    }

}
