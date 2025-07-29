package ch02_control_statement;

public class While01 {
    public static void main(String[] args) {
        int i = 1;
        int total = 0;
        while(i <= 10){
            total += i;
            i++;
        }
        System.out.println("총합01 : " + total);

        i = 1;
        total = 0;
        while (i <= 100){
            total += i;
            i = i + 3;
        }
        System.out.println("총합02 : " + total);

        i = 97;
        total = 0;
        while (i >= 2){
            total += i;
            i = i - 5;
        }
        System.out.println("총합03 : " + total);

        i = 1;
        total = 0;
        while (i <= 96){
            total += Math.pow(i,2);
            i += 5;
        }
        System.out.println("총합04 : " + total);

        i = 1;
        total = 0;
        while (i <= 5){
            total += i * (i + 1);
            i++;
        }
        System.out.println("총합05 : " +  total);
    }
}
