package ch02_control_statement;

public class For01 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 0; i <= 10 ; i++) {
            total += i;
        }
        System.out.println("총합01 : " + total);

        total = 0;
        for (int x = 1; x <= 100; x = x + 3){
            total += x;
        }
        System.out.println("총합02 : " + total);

        total = 0;
        for (int z = 97; z >= 2; z = z - 5){
            total += z;
        }
        System.out.println("총합03 : " + total);

        total = 0;
        for (int a = 1; a <= 96; a = a + 5){
            total += Math.pow(a,2);
        }
        System.out.println("총합04 : " + total );

        total = 0;
        for (int a = 1; a <= 5; a++){
            total += a * (a + 1);
        }
        System.out.println("총합05 : " + total);
    }
}
