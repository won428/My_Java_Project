package ch02_control_statement;

public class For02 {
    public static void main(String[] args) {
        int su = 10;
        int odd = 0, even = 0;
        for(int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                even += i;
            }
            else if ((i % 2) != 0){
                odd += i;
            }
        }
        System.out.println("홀수의 총합 : " + odd);
        System.out.println("짝수의 총합 : " + even);
    }
}
