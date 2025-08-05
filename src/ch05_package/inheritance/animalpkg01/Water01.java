package ch05_package.inheritance.animalpkg01;

public class Water01 extends Animal01{
    public Water01(String name, int lifespan, String habiat, double speed, String animalparts){
        super(name, lifespan, habiat, speed, animalparts);
    }


    @Override
    public String speed(){
        String message = "헤엄칩니다.";
        return super.speed() + message;
    }
}
