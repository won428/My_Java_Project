package ch01_variable_operator;

public class Food {
    public static void main(String[] args) {
        int rice_noodle = 10000, spicy_rice_noodle = 12000, zero_coke = 2000;
        int chulsu_price = rice_noodle + zero_coke;
        int younghee_price = spicy_rice_noodle;
        System.out.println("쌀국수 : " + rice_noodle);
        System.out.println("매운 쌀국수 : " + spicy_rice_noodle);
        System.out.println("제로 콜라 : " + zero_coke);
        System.out.println();
        System.out.println("계산서");
        System.out.println("철수 : " + chulsu_price);
        System.out.println("영희 : " + younghee_price);

    }
}
