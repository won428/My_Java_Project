package ch06_abstract_interface.car;

public class Sonata extends Car{
    private String maker;

    public Sonata(String name, int price, Key key, String maker){
        super(name, price, key);
        this.maker = maker;
    }

    @Override
    public String toString() {
        return super.toString() + "제조사 : " + maker;
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
