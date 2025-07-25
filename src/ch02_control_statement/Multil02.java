package ch02_control_statement;

public class Multil02 {
    public static void main(String[] args) {
        //8세 미만 : "유아(무료 입장)"
        //14세 미만 : "어린이(50% 할인)"
        //20세 미만 : "청소년(30% 할인)"
        //65세 이상 : "노인(40% 할인)"
        //이외 : "성인(정가)"
        int age = -1;
        double discount;
        double ticket = 1000;
        int price;
        String comment;

        if(age < 0 || age > 130){
            System.out.println("잘못 입력된 나이 입니다.");
        }else {
            if (age < 8) {
                discount = 0;
                comment = "무료 입장입니다";
            } else if (age < 14) {
                discount = 0.5;
                comment = "어린이(50% 할인)";
            } else if (age < 20) {
                discount = 0.7;
                comment = "청소년(30% 할인)";
            } else if (age > 65) {
                discount = 0.6;
                comment = "노인(40% 할인)";
            } else {
                discount = 1;
                comment = "할인이 적용되지 않습니다";
            }

            price = (int) (ticket * discount); // 1 조건문에서 나온 결과 값을 가지고 2 조건문 실행

            System.out.println(comment);
            System.out.println(age + "세 이므로 " + price + "원 입니다.");

        }
        }
}
