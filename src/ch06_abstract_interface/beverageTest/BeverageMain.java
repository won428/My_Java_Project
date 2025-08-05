package ch06_abstract_interface.beverageTest;

public class BeverageMain {
    public static void main(String args[]){
        Beverage[] beverage = {
                new Americano("아메리카노", 4000, 1, 500),
                new Espresso("에스프레소", 3000, 2),
                new Latte("카페라떼", 5000, 1, 500)
        };

        for (int i = 0; i < beverage.length; i++) {
            beverage[i].showdata();
            beverage[i].makedrink();
            System.out.println();
        }


    }
}
