package ch05_package.inheritance.practice;

public class P_Lion extends P_Animal{
   public P_Lion(String name){
        super(name);
    }

    @Override
    public void breath(){
        System.out.println("사자는 폐로 숨을 쉽니다.");
    }
}
