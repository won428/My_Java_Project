package ch05_package.inheritance.animalpkg01;

public class GoldFish01 extends Water01{
    private int gill;

    GoldFish01(String name, int lifespan, String habiat, double speed, int gill, String animalparts){
        super(name, lifespan, habiat, speed, animalparts);
        this.gill = gill;
    }

    @Override
    public String toString(){
        String message = gill + "개 입니다.";
        return super.toString() + message;
    }




}
