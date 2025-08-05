package ch05_package.inheritance.practice;

public class P_AnimalMain {
    public static void main(String[] args) {
        P_Animal[] animal = {
                new P_Lion("사자"),
                new P_GoldFish("금붕어"),
                new P_Eagle("독수리")
        };

        P_Eagle eagle = (P_Eagle) animal[2];

        for (int i = 0; i < animal.length; i++) {
            if(i == 2){

                animal[i].breath();
                eagle.fly();
            }else{
            animal[i].breath();
            }

        }

    }
}
