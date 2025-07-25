package ch02_control_statement;

public class Forswitch01 {
    public static void main(String[] args) {
        int odd = 0, even = 0;
        int su = 10;
        for(int i = 1; i <= su; i++){
            switch (i % 2){
                case 0 :
                    odd += i;
                    break;
                default:
                    even += i;
            }
        }
        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);
    }
}
