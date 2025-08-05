package ch06_abstract_interface.car;

public abstract class Car implements Speed, Display, Radio{
    private String name;
    private int price;
    private Key key ; // 열쇠의 종류
    protected int speed;

    @Override
    public String toString() {
        String message =
                "차량 이름 : " + this.name + "\n" +
                "단가 : " + this.price + "원\n" +
                "키의 종류 : " + this.key.getName() + "\n";
        return message;
    }

    public String getName() {
        return name;
    }

    public int getSpeed(){
        return speed;
    }

    public Car(){ }

    public Car(String name, int price, Key key){
       this.name = name;
       this.price = price;
       this.key = key;
    }

    public final void turnOn(){
        String message = this.key.getName() + "로 " + this.name + "의 시동을 켭니다.";
        System.out.println(message);
    }

    public final void turnOff(){
        String message = this.name + "의 시동을 끕니다.";
        System.out.println(message);
    }

    // 최대 속도를 초과하면 허용 최고 속도로 제한시키기
    public int checkSpeed(){
        if(this.speed >= Speed.AllOWD_MAX_SPEED) {
            String message = Speed.AllOWD_MAX_SPEED + "Km 이상 과속하지 마세요.";
            System.out.println(message);
            return Speed.AllOWD_MAX_SPEED;
        }else {
            return this.speed;
        }
    }
}
