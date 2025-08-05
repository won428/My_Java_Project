package ch05_package.inheritance.animalpkg01;

public class Lion01 extends Ground01{
    private int leg;

    Lion01(String name, int lifespan, String habiat, double speed, int leg,String animalparts){
        super(name, lifespan, habiat, speed,animalparts);
        this.leg = leg;
    }
    @Override
    public String toString(){
        String message = leg + "개 입니다.";
        return super.toString() + message;
    }


}
