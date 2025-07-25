package ch02_control_statement;

public class SayHello {
    public static void main(String[] args) {
        int say = 5;
        String Hello = "안녕하세요";
        for (int su = 1; su <= say; su++){
            System.out.println(Hello);
        }

        String[] names = {"철수", "영희", "민수", "지영"};

        for(String name : names){
            System.out.println("학생이름 : " + name);
        }

        int total = 0;
        int su = 3;
        for(int x = 1; x <= 9 ; x++) {
            String message = su + " * " + x + " = " + (su * x);
            System.out.println(message);
        }

            int y = 1;

            for(y = 1; y <= 7; y++){
            String message2 =  y + "의 제곱은 " + (y * y) + "입니다";
                System.out.println(message2);
            }

            int su01 = 3;
            int su02 = 7;
            total = 0;
            for (int x = su01; x <= su02; x++){
                total += x;
            }




    }
}

