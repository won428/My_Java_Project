package ch06_abstract_interface.car;

public class Grandeur extends Car{
    private double fuel; // 연비
    private String remark; // 연비에 대한 메모, 연비의 파생변수
    // 파생변수는 일반적으로 생성자에 매개변수로 넣지 않는다.

    public Grandeur(String name, int price, Key key, double fuel){
        super(name, price, key);
        this.fuel = fuel;

        if(this.fuel >= 20.0){
            this.remark = "excellent";
        }else if(this.fuel >= 15.0 ){
            this.remark = "good";
        }else{
            this.remark = "poor";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "연비 : " + this.fuel + "\n" + "연비 메모 : " + remark;
    }

    @Override
    public void display() {
        double mileSpeed = super.speed / 1.6;
        String message = this.getName() + "의 현재속도 : " + mileSpeed + "mile 입니다.";
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
