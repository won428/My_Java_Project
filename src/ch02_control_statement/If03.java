package ch02_control_statement;

public class If03 {
    public static void main(String[] args) {
        int su = 7; //3의 배수이면 제곱, 3의 배수가 아니면 더하기 5를 하시오.
        if(su%3 == 0){
            System.out.println(su + "는(은) 3의 배수입니다.");
            System.out.println(su*su);
        }else{
            System.out.println(su + "는(은) 3의 배수가 아닙니다");
            System.out.println(su + 5);
        }

    }
}
