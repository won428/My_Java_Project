package ch06_abstract_interface.car;


public class Avante extends Car{
    private String message;

    public Avante(String name, int price, Key key, String message){
        super(name, price, key);
        this.message = message;
    }

    @Override
    public String toString(){
        return super.toString() + "코멘트 : " + message;
    }

    @Override
    public void display() {
        String message = this.getName() + "의 현재속도 : " + super.getSpeed() + "km";
        System.out.println(message);
    }

    @Override
    public void speedUp(int speed) {
        super.speed += speed;
        super.speed = super.checkSpeed();
    }

    @Override
    public void speedDowun(int speed) {
        super.speed -= speed < 0 ? -speed : speed;
    }
}
