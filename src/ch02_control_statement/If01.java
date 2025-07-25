package ch02_control_statement;

public class If01 {
    public static void main(String[] args) {
        int su = 7;

        if(su%2 == 0){
            System.out.println("짝수야 놀자~~");
        }
        // 단순 if 구문
        if(su%2 == 0) {
            System.out.println("숫자 " + su + "은(는) 짝수입니다.");
            System.out.println("하하하");
        } else {
            System.out.println("숫자 " + su + "은(는) 홀수입니다.");
            System.out.println("호호호");
        } // 양자택일 if 구문
        System.out.println("크크크");


    }
}
