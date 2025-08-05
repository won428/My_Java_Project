package ch05_package.inheritance.animalpkg01;

public class AnimalMain {
    public static void main(String[] args) {
        Animal01[] animal = {
                new GoldFish01("금붕어", 2, "거실 어항", 10, 2, "아가미"),
                new Lion01("사자", 15, "세렝게티", 10, 4, "다리"),
                new Eagle01("독수리", 20, "푸른 창공", 50, 2, "날개")
        };

        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i]);
            System.out.println(animal[i].speed());
        }
    }
}

