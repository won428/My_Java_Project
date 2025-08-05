package ch05_package.inheritance.animalpkg01;

public class Eagle01 extends Sky01{
    private int wing;

    Eagle01(String name, int lifespan, String habiat, double speed, int wing,String animalparts){
        super(name, lifespan, habiat, speed,animalparts);
        this.wing = wing;
    }

    @Override
    public String toString(){
        String message = wing + "개 입니다.";
        return super.toString() + message;
    }
}
