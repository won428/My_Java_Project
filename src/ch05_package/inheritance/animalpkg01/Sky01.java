package ch05_package.inheritance.animalpkg01;

public class Sky01 extends Animal01{
    public Sky01(String name, int lifespan, String habiat, double speed, String animalparts){
        super(name, lifespan, habiat, speed, animalparts);
    }

    @Override
    public String speed(){
        String message = "날아갑니다.";
        return super.speed() + message;
    }
}
