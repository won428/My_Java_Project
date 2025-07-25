package ch02_control_statement;

public class Forif01 {
    public static void main(String[] args) {
        int x = 10;
        int sum0 = 0, sum1 = 0, sum2 = 0;
        for (int i = 1; i <= x; i++){
            if(i % 3 == 0){
                sum0 += i;
            }else if(i % 3 == 1){
                sum1 += i;
            }else if(i % 3 == 2){
                sum2 += i;
            }
        }
        System.out.println("sum0 : " + sum0);
        System.out.println("sum01 : " + sum1);
        System.out.println("sum02 : " + sum2);
    }
}
