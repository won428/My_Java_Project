package ch06_abstract_interface.car;

public class CarMain {
    public static void main(String[] args) {
        Car[] mycar = {
                new Avante("아반떼", 100, Key.KEY, "가장 많은 판매"),
                new Sonata("소나타", 300, Key.SMART, "Hyundai"),
                new Grandeur("그랜져", 200, Key.SMART, 17.0)
        };

        for (int i = 0; i < mycar.length; i++) {
            System.out.println("===========");
            mycar[i].turnOn();
            mycar[i].sayHello(mycar[i].getName(), 1);
            System.out.println(mycar[i]);
            Radio.play(Frequency.FM, 91.9);
            // 객체 출력한다는 것은 암시적으로 toString() 메소드를 호출합니다.

            mycar[i].display();

            mycar[i].speedUp(20);
            mycar[i].display();

            mycar[i].speedUp(Speed.AllOWD_MAX_SPEED);
            mycar[i].display();

            mycar[i].speedDowun(15);
            mycar[i].display();

            mycar[i].turnOff();

        }
    }
 }

